package com.yisoo.controller;

import com.yisoo.bean.FileMsg;
import com.yisoo.bean.GroupData;
import com.yisoo.bean.GroupInfo;
import com.yisoo.bean.ProjectInfo;
import com.yisoo.service.*;
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
import java.io.IOException;

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
    @RequestMapping(value = "file/upload/stream",method = RequestMethod.POST)
    @ResponseBody
    public FileMsg getFileStream(
            @RequestParam("file") MultipartFile file,
            @RequestParam("projectid")Integer projectid,
            @RequestParam("gid")Integer gid,
            HttpServletRequest request
    ){
        System.out.println(projectid);
        System.out.println(gid);
        GroupInfo groupInfo = groupInfoService.get(gid);
        ProjectInfo projectInfo = projectInfoService.getProjectInfoByKey(projectid);
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
//        写入提交日志
        new
//        写入文件日志

//        完成文件备份
//        FileMsg success = FileMsg.success();
//        success.setMessage("上传完成啦");
//        return success;

    }
}
