package com.yisoo.controller;

import com.yisoo.bean.*;
import com.yisoo.service.DownLogService;
import com.yisoo.service.FileInfoService;
import com.yisoo.service.ProjectInfoService;
import com.yisoo.service.UserService;
import com.yisoo.util.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.poi.hssf.record.UserSViewBegin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static com.yisoo.util.MailUtil.sendEmailAccount;

@Controller
public class DownLogController {
    @Autowired
    FileInfoService fileInfoService;
    @Autowired
    ProjectInfoService projectInfoService;
    @Autowired
    DownLogService downLogService;
    @Autowired
    UserService userService;
    @RequestMapping(value = "down/solve/part",method = RequestMethod.POST)
    @ResponseBody
    public DownMsg downLogPart(
            @RequestParam("yisooid")Integer yisooid,
            @RequestParam("projectid")Integer projectid,
            @RequestParam("ids[]")ArrayList<Integer> ids,
            HttpServletRequest request
    ) throws IOException {
        List<File> fileList = new ArrayList<>();
        DownLog downLog = new DownLog();
        StringBuffer HashTemp= new StringBuffer();
        ProjectInfo projectInfo = projectInfoService.getProjectInfoByKey(projectid);
        for(Integer fileid:ids){
            FileInfo fileInfo = fileInfoService.get(fileid);
            fileList.add(new File(fileInfo.getFileParent()+"\\"+fileInfo.getFileName()));
            HashTemp.append(fileInfo.getFileMd5());
        }
        String HashStr = DigestUtils.md5Hex(HashTemp.toString());
        DownLog downLogtemp = downLogService.getByHash(HashStr,"part");
        if(downLogtemp != null){
//            System.out.println("快速下载");
            downLogtemp.setDownId(null);
            downLogtemp.setdIp(IpAddressUtil.getIpAddress(request));
            downLogtemp.setdTime(new Date());
            downLogService.add(downLogtemp);
            downLogtemp = downLogService.getByDownLog(downLogtemp);
            DownMsg success = DownMsg.success("3",String.valueOf(downLogtemp.getDownId()), downLogtemp.getdFilename(), null);
            success.setType(String.valueOf(downLogtemp.getDownId()));
            return success;
        }else{
            String newpath = request.getSession().getServletContext().getRealPath("down-files");
            String newfilename = projectInfo.getpTitle()+"-"+new Date().getTime()+"+part"+".zip";
            downLog.setdFileparent(newpath);
            downLog.setdFilename(newfilename);
            //        创建目录
            File tempDir = new File(newpath);
            if(!tempDir.exists()){
                tempDir.mkdirs();
            }
            FileOutputStream fos2 = new FileOutputStream(new File(newpath+"\\"+newfilename));
            ZipUtils.toZip(fileList, fos2);
            fos2.close();

            downLog.setYisooidId(yisooid);
            downLog.setProjectId(projectid);
            downLog.setdType("part");
            downLog.setdIp(IpAddressUtil.getIpAddress(request));
            downLog.setdTime(new Date());
            downLog.setdHash(HashStr);

            FileInputStream fis = new FileInputStream(new File(newpath + "\\" + newfilename));
            downLog.setdMd5(DigestUtils.md5Hex(fis));
            fis.close();

            downLogService.add(downLog);
            downLog = downLogService.getByDownLog(downLog);
            DownMsg success = DownMsg.success("3",String.valueOf(downLog.getDownId()), downLog.getdFilename(), null);
            success.setType(String.valueOf(downLog.getDownId()));
            return success;
        }

    }

    @RequestMapping(value = "down/solve/all",method = RequestMethod.POST)
    @ResponseBody
    public DownMsg downLogAll(
            @RequestParam("yisooid")Integer yisooid,
            @RequestParam("projectid")Integer projectid,
            HttpServletRequest request
    ) throws IOException {
//        对文件求MD5string的md5
        List<FileInfo> fileInfos = fileInfoService.getByProjectid(projectid);
        StringBuffer HashTemp= new StringBuffer();
        for (FileInfo item:
             fileInfos) {
            HashTemp.append(item.getFileMd5());
        }
        String HashStr = DigestUtils.md5Hex(HashTemp.toString());
        DownLog downLogtemp = downLogService.getByHash(HashStr,"all");
        if(downLogtemp != null){
//            System.out.println("快速下载");
            downLogtemp.setDownId(null);
            downLogtemp.setdIp(IpAddressUtil.getIpAddress(request));
            downLogtemp.setdTime(new Date());
            downLogService.add(downLogtemp);
            downLogtemp = downLogService.getByDownLog(downLogtemp);
            DownMsg success = DownMsg.success("2",String.valueOf(downLogtemp.getDownId()), downLogtemp.getdFilename(), null);
            success.setType(String.valueOf(downLogtemp.getDownId()));
            return success;
        }else{
            ProjectInfo projectInfo = projectInfoService.getProjectInfoByKey(projectid);
            DownLog downLog = new DownLog();
            downLog.setYisooidId(yisooid);
            downLog.setProjectId(projectid);
            downLog.setdType("all");
            downLog.setdIp(IpAddressUtil.getIpAddress(request));
            downLog.setdTime(new Date());
            downLog.setdHash(HashStr);
            String oldpath = request.getSession().getServletContext().getRealPath("project-files")+"\\"+projectInfo.getpPath();
            String newpath = request.getSession().getServletContext().getRealPath("down-files");
            //        创建目录
            File tempDir = new File(newpath);
            if(!tempDir.exists()){
                tempDir.mkdirs();
            }
            String newfilename = projectInfo.getpTitle()+"-"+new Date().getTime()+".zip";
            FileOutputStream fos1 = new FileOutputStream(new File(newpath + "\\" +newfilename));
            ZipUtils.toZip(oldpath, fos1,true);
            fos1.close();

            downLog.setdFileparent(newpath);
            downLog.setdFilename(newfilename);
            FileInputStream fis = new FileInputStream(new File(newpath + "\\" + newfilename));
            downLog.setdMd5(DigestUtils.md5Hex(fis));
            fis.close();

            downLogService.add(downLog);
            downLog = downLogService.getByDownLog(downLog);
            DownMsg success = DownMsg.success("2",String.valueOf(downLog.getDownId()), downLog.getdFilename(), null);
            success.setType(String.valueOf(downLog.getDownId()));
            return success;
        }


    }


    @RequestMapping(value = "down/solve/one",method = RequestMethod.POST)
    @ResponseBody
    public DownMsg downLogOne(
         @RequestParam("yisooid")Integer yisooid,
         @RequestParam("projectid")Integer projectid,
         @RequestParam("fileid")Integer fileid,
         HttpServletRequest request
    ){
//        校验项目id与文件id
        FileInfo fileInfo = fileInfoService.get(fileid);
        if (fileInfo.getProjectId() == projectid){
            DownLog downLog = new DownLog();
            downLog.setYisooidId(yisooid);
            downLog.setProjectId(projectid);
            downLog.setdType(String.valueOf(fileid));
            downLog.setdFileparent(fileInfo.getFileParent());
            downLog.setdFilename(fileInfo.getFileName());
            downLog.setdIp(IpAddressUtil.getIpAddress(request));
            downLog.setdMd5(fileInfo.getFileMd5());
            downLog.setdTime(new Date());
            downLog.setdHash(String.valueOf(fileid));
            downLogService.add(downLog);
            downLog = downLogService.getByDownLog(downLog);
            List<DownLog> d = new ArrayList<>();
            d.add(downLog);
            DownMsg success = DownMsg.success("1",String.valueOf(downLog.getDownId()), downLog.getdFilename(), d);
            return success;
        } else {
            return DownMsg.success("","","",new ArrayList<>());
        }
    }
    @RequestMapping(value="down/action",method = RequestMethod.GET)
    @ResponseBody
    public void downFileAction(@RequestParam(value="downid")Integer downid,
                               @RequestParam(value = "type")Integer type,
                               HttpServletRequest request,
                               HttpServletResponse response) throws IOException {
        DownLog downLog = downLogService.get(downid);
        if(type == 1){//单独下载
            Integer projectId = downLog.getProjectId();
            ProjectInfo projectInfo = projectInfoService.getProjectInfoByKey(projectId);
            DownFileStreamUtil.actionFileDown("project-files\\"+projectInfo.getpPath(),downLog.getdFilename(),request,response);
        }else if(type == 2){//全部下载
            DownFileStreamUtil.actionFileDown("down-files",downLog.getdFilename(),request,response);
        }else if(type == 3){
            DownFileStreamUtil.actionFileDown("down-files",downLog.getdFilename(),request,response);

        }
    }
    @RequestMapping(value="down/email",method = RequestMethod.GET)
    @ResponseBody
    public DownMsg downFileEmail(@RequestParam(value="downid")Integer downid,
                                 @RequestParam(value="type")String type) throws Exception {
        DownLog downLog = downLogService.get(downid);
        Integer projectId = downLog.getProjectId();
        ProjectInfo projectInfo = projectInfoService.getProjectInfoByKey(projectId);
        User user = userService.getUserByYisoo(downLog.getYisooidId());
        String eTitle = "YiSoo文件-"+projectInfo.getpTitle()+"-"+type;
        String filepath = downLog.getdFileparent()+"\\"+downLog.getdFilename();
        MailUtil mailUtil = new MailUtil();
        Session session = mailUtil.session;
        // 3. 创建一封邮件
        MimeMessage message = mailUtil.createMimeMessage(session, sendEmailAccount, user.getEmail(),
                "YiSooEmail","admin",eTitle,filepath);
        // 4. 根据 Session 获取邮件传输对象
        Transport transport = session.getTransport();

        // 5. 使用 邮箱账号 和 密码 连接邮件服务器
        //    这里认证的邮箱必须与 message 中的发件人邮箱一致，否则报错
        transport.connect(sendEmailAccount, MailUtil.sendEmailPwd);

        // 6. 发送邮件, 发到所有的收件地址, message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
        transport.sendMessage(message, message.getAllRecipients());
        // 7. 关闭连接
        transport.close();
        DownMsg downMsg = new DownMsg();
        downMsg.setResult("200");
        downMsg.setMessage("稍后发送至邮箱~");
        return downMsg;
    }
}
