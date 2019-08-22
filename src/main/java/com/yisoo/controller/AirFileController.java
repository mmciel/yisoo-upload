package com.yisoo.controller;

import com.yisoo.bean.AirFile;
import com.yisoo.bean.AirLog;
import com.yisoo.service.AirLogService;
import com.yisoo.util.DownFileStreamUtil;
import com.yisoo.util.IpAddressUtil;
import com.yisoo.bean.UploadMsg;
import com.yisoo.service.AirFileService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.Date;

@Controller
public class AirFileController {
    @Autowired
    AirFileService airFileService;
    @Autowired
    AirLogService airLogService;

    @RequestMapping(value="/air/down",method = RequestMethod.GET)
    @ResponseBody
    public UploadMsg downFile(@RequestParam(value="downcode")String share,
                              HttpServletRequest request){
//        filename是文件的分享码
//        通过分享码获取文件地址
        AirFile airfile = airFileService.getAirFlieByShare(share);
        String filename = airfile.getAirName();
        if(airfile.getAirNum() == 0) {//文件下载次数超限
            UploadMsg msg = UploadMsg.fail();
            msg.setId(airfile.getAirId());
            msg.setMessage("可用下载次数为0");
            msg.setUrl(filename);
            return msg;
        }else if(airfile.getAirNum()>0){
            airfile.setAirNum(airfile.getAirNum()-1);
            airFileService.updateAirFile(airfile);
        }
//            下载信息记录到数据库
        AirLog airLog = new AirLog();
        airLog.setAirId(airfile.getAirId());
        airLog.setAirTime(new Date());
        airLog.setAirAdress(IpAddressUtil.getIpAddress(request));
        airLog.setAirFlag("download");
        airLogService.addAirLog(airLog);
////        返回信息
        UploadMsg msg = UploadMsg.success();
        msg.setId(airfile.getAirId());
        msg.setMessage("正在下载~");
        msg.setUrl(filename);
        return msg;
    }
    @RequestMapping(value="/air/down/action",method = RequestMethod.GET)
    @ResponseBody
    public void downFileAction(@RequestParam(value="filename")String filename,
                               HttpServletRequest request,
                               HttpServletResponse response) throws IOException {
        DownFileStreamUtil.actionFileDown("air-warehouse",filename,request,response);
    }

    @RequestMapping(value="/air/data",method = RequestMethod.POST)
    @ResponseBody
    public UploadMsg uploadData(@RequestParam("airId")String id,
        @RequestParam("airNum")String num, @RequestParam("airLong")String day
    ){
//        System.out.println(id);
//        System.out.println(num);
//        System.out.println(day);
        AirFile airFile = airFileService.getAirFileById(Integer.valueOf(id));

        String md5 = airFile.getAirMd5();
        airFile.setAirShare(md5);
        airFile.setAirLong(Integer.valueOf(day));
        airFile.setAirNum(Integer.valueOf(num));

        airFileService.updateAirFile(airFile);

        UploadMsg msg = UploadMsg.success();
        msg.setId(Integer.valueOf(id));
        msg.setMessage("获取分享码成功!");
        msg.setUrl(md5);
        return msg;
    }
    @RequestMapping(value="/air/upload",method = RequestMethod.POST)
    @ResponseBody
    public UploadMsg uploadFile(MultipartFile file, HttpServletRequest request){
        String path = request.getSession().getServletContext().getRealPath("air-warehouse");
        String fileName = file.getOriginalFilename();
        File dir = new File(path,fileName);
        if(!dir.exists()){
            dir.mkdirs();
        }
        try {
            file.transferTo(dir);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        完整的文件名：path+"\\"+fileName
//        File对象处理成bean
        AirFile airFile = AirFileController.FileToAirFile(path,fileName);
//      插入数据库并返回id
        airFileService.addAirFile(airFile);


        Integer id = airFileService.getIdByMd5(airFile.getAirMd5());
        UploadMsg uploadMsg = UploadMsg.success();
        uploadMsg.setMessage("请提交文件配置信息哦");
        uploadMsg.setId(id);

        //上传信息信息记录到数据库
        AirLog airLog = new AirLog();
        airLog.setAirId(id);
        airLog.setAirTime(new Date());
        airLog.setAirAdress(IpAddressUtil.getIpAddress(request));
        airLog.setAirFlag("upload");
        airLogService.addAirLog(airLog);

        return uploadMsg;
    }

    private static AirFile FileToAirFile(String path,String fileName){
        File file = new File(path+"\\"+fileName);
        AirFile airFile = new AirFile();
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            airFile.setAirName(fileName);
            airFile.setAirSize((int) file.length());
            airFile.setAirPath(path);
            airFile.setAirDate(new Date());
            airFile.setAirMd5(DigestUtils.md5Hex(fileInputStream));
            fileInputStream.close();
        } catch (IOException e) {
            airFile.setAirMd5("0000000000000000");
            e.printStackTrace();
        } finally {
//            System.out.println(airFile);
            return airFile;
        }
    }
}
