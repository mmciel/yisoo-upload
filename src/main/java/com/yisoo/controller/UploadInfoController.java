package com.yisoo.controller;

import com.github.pagehelper.PageHelper;
import com.yisoo.bean.*;
import com.yisoo.service.*;
import com.yisoo.util.IpAddressUtil;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import sun.reflect.generics.tree.Tree;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UploadInfoController {
    @Autowired
    UploadInfoService uploadInfoService;

    @Autowired
    FileInfoService fileInfoService;

    @Autowired
    GroupInfoService groupInfoService;

    @Autowired
    ProjectInfoService projectInfoService;

    @RequestMapping(value = "data/upload/solve",method = RequestMethod.GET)
    @ResponseBody
    public UploadSolveMsg getUploadSolve(
            @RequestParam("projectid")Integer projectid,
            @RequestParam("page") Integer page,
            @RequestParam("limit") Integer limit
    ){
        Integer temp = fileInfoService.countfileInfoByProjectId(projectid);
        PageHelper.startPage(page, limit);
//        根据projectid查询所有提交记录
        List<FileInfo> fileinfos = fileInfoService.getByProjectid(projectid);
        ArrayList<FileInfoAndGroupInfo> fileInfoAndGroupInfos = new ArrayList<>();
        for (FileInfo item : fileinfos){
            fileInfoAndGroupInfos.add(new FileInfoAndGroupInfo(item,
                    groupInfoService.get(item.getgId())));
        }
        return UploadSolveMsg.success(fileInfoAndGroupInfos,String.valueOf(temp));
    }

    @RequestMapping(value = "data/upload/log",method = RequestMethod.GET)
    @ResponseBody
    public UploadLogMsg getUploadLog(
            @RequestParam("projectid")Integer projectid,
            @RequestParam("page") Integer page,
            @RequestParam("limit") Integer limit
    ){
        Integer temp = uploadInfoService.countuploadInfoByProjectId(projectid);
        PageHelper.startPage(page, limit);
//        根据projectid查询所有提交记录
        List<UploadInfo> uploadInfos = uploadInfoService.getByProjectid(projectid);
        ArrayList<UploadInfoAndGroupInfo> uploadInfoAndGroupInfos = new ArrayList<>();
        for (UploadInfo item : uploadInfos){
            uploadInfoAndGroupInfos.add(new UploadInfoAndGroupInfo(item,
                    groupInfoService.get(item.getgId())));
        }
        return UploadLogMsg.success(uploadInfoAndGroupInfos,String.valueOf(temp));
    }


    @RequestMapping(value = "file/upload/check",method = RequestMethod.POST)
    @ResponseBody
    public FileMsg getFileStream(
            @RequestParam("projectid")Integer projectid,
            @RequestParam("gid")Integer gid
    ){
//        检测此用户是否已经提交
        UploadInfo checkResult = uploadInfoService.checkOldUpload(projectid, gid);
        if (checkResult != null){
            FileMsg fail = FileMsg.fail();
            fail.setMessage("数据异常");
            fail.setResult("no");
            fail.setUploadInfo(checkResult);
            return fail;
        }else{
            FileMsg success = FileMsg.success();
            success.setMessage("数据可提交");
            success.setResult("ok");
            return success;
        }
    }

    @RequestMapping(value = "file/upload/stream",method = RequestMethod.POST)
    @ResponseBody
    public FileMsg getFileStream(
            @RequestParam("file") MultipartFile file,
            @RequestParam("projectid")Integer projectid,
            @RequestParam("gid")Integer gid,
            HttpServletRequest request
    ){
//        System.out.println(projectid);
//        System.out.println(gid);
        GroupInfo groupInfo = groupInfoService.get(gid);
        ProjectInfo projectInfo = projectInfoService.getProjectInfoByKey(projectid);

//        生成数据源
        UploadInfo uploadInfo = new UploadInfo();
        FileInfo fileInfo = new FileInfo();

        //        检测此用户是否已经提交，提交过就清除源文件
        UploadInfo checkResult = uploadInfoService.checkOldUpload(projectid, gid);
        if (checkResult != null){
            Integer delFileId = checkResult.getFileId();
            FileInfo delFileInfo = fileInfoService.get(delFileId);
            String OldPath = delFileInfo.getFileParent();

            String Path = OldPath.substring(0,OldPath.lastIndexOf("\\"))+"\\re-submit\\";
            //        创建目录
            File tempDir = new File(Path);
            if(!tempDir.exists()){
                tempDir.mkdirs();
            }
            String NewFileStr = Path+delFileInfo.getFileMd5()+"+"+delFileInfo.getFileName();
            String OldFileStr = OldPath+"\\"+delFileInfo.getFileName();
            File NewFile = new File(NewFileStr);
            File OldFile = new File(OldFileStr);
            boolean b = OldFile.renameTo(NewFile);
//            去除file
            delFileInfo.setFileParent(Path);
            delFileInfo.setFileName(delFileInfo.getFileMd5()+"+"+delFileInfo.getFileName());
            delFileInfo.setFileType(0);
            fileInfoService.update(delFileInfo);
        }

//        根据gid命名
        String oldName = file.getOriginalFilename();
        String suffix = oldName.substring(oldName.lastIndexOf("."));
        String fileName = groupInfo.getgNumber()+ "_" +groupInfo.getgName()+suffix;
//      文件目录
        String TreePath = request.getSession().getServletContext().getRealPath("project-files");
        String Path = TreePath+"\\"+projectInfo.getpPath();
//        创建目录
        File tempDir = new File(Path);
        if(!tempDir.exists()){
            tempDir.mkdirs();
        }
//        写入文件
        File userFile = new File(Path,fileName);
        if(!userFile.exists()){
            userFile.mkdirs();
        }
        try {
            file.transferTo(userFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
//        fileInfo写入对象
        fileInfo.setFilePerm(0);
        fileInfo.setFileCreate(new Date());
        fileInfo.setProjectId(projectid);
        fileInfo.setFileName(fileName);
        fileInfo.setFileParent(Path);
        fileInfo.setgId(gid);
        fileInfo.setFileSuffix(suffix);
        fileInfo.setFileType(1);
        fileInfo.setFileSize((double) userFile.length());
        try {
            FileInputStream fileInputStream = new FileInputStream(userFile);
            String s = DigestUtils.md5Hex(fileInputStream);
            fileInfo.setFileMd5(s);
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        fileInfo写入提交日志
        fileInfoService.add(fileInfo);
        Integer fileId = fileInfoService.getByMd5(fileInfo.getFileMd5()).getFileId();
        fileInfo.setFileId(fileId);
//      uploadInfo对象
        uploadInfo.setFileId(fileId);
        uploadInfo.setProjectId(projectid);
        uploadInfo.setgId(gid);
        uploadInfo.setUploadIp(IpAddressUtil.getIpAddress(request));
        uploadInfo.setUploadTime(fileInfo.getFileCreate());
//        写入数据项
        uploadInfoService.add(uploadInfo);
        UploadInfo tempU = uploadInfoService.getByOtherId(fileId, gid);
        uploadInfo.setUploadCode(String.valueOf(tempU.getUploadId()));
        uploadInfo.setUploadId(tempU.getUploadId());
        uploadInfoService.update(uploadInfo);


        FileMsg success = FileMsg.success();
        success.setMessage("上传完成啦");
        success.setResult("ok");
        success.setFileInfo(fileInfo);
        success.setUploadInfo(uploadInfo);
        success.setFileId(String.valueOf(fileId));
        return success;
    }
}
