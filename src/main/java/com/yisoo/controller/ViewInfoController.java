package com.yisoo.controller;

import com.yisoo.bean.FileInfo;
import com.yisoo.bean.ViewInfo;
import com.yisoo.bean.ViewMsg;
import com.yisoo.service.FileInfoService;
import com.yisoo.service.ViewInfoService;
import com.yisoo.util.IpAddressUtil;

import com.yisoo.util.PathUtil;
import com.yisoo.util.WordToPdf;
import org.apache.commons.io.IOUtils;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

@Controller
public class ViewInfoController {
    @Autowired
    FileInfoService fileInfoService;
    @Autowired
    ViewInfoService viewInfoService;

    @RequestMapping(value = "view/file",method = RequestMethod.GET)
    @ResponseBody
    public ViewMsg viewFile(
            @RequestParam("fileid")Integer fileid,
            HttpServletRequest request

    ) throws IOException {


        ViewInfo v = viewInfoService.getByFileid(fileid);
        if (v != null) {
            ViewMsg msg0 = ViewMsg.success(v.getPdfName());
            return msg0;
        }
        FileInfo fileInfo = fileInfoService.get(fileid);
        Date date = new Date();
        ViewInfo viewInfo = new ViewInfo();
        if (fileInfo.getFileSuffix().equals(".doc") || fileInfo.getFileSuffix().equals(".docx")) {
            String oldFile = fileInfo.getFileParent()+ PathUtil.OP+fileInfo.getFileName();
            String newFile = String.valueOf(fileInfo.getFileId())+"+"+String.valueOf(fileInfo.getgId())
                    + "+"+String.valueOf(fileInfo.getProjectId())+"+"+
                    date.getTime()+"+"+ViewInfoController.getFileNameNoEx(fileInfo.getFileName())+".pdf";
            viewInfo.setFileId(fileid);
            viewInfo.setPdfName(newFile);
            viewInfo.setvIp(IpAddressUtil.getIpAddress(request));
            viewInfo.setvTime(date);
            String sPath = request.getSession().getServletContext().getRealPath("view-files");

//            开始转换
//            WordToPdf.doc2pdf(oldFile,sPath+"\\"+newFile);
            WordToPdf.doc2pdf(oldFile,sPath+PathUtil.OP+newFile);

            viewInfoService.add(viewInfo);
//            ViewInfo byFileid = viewInfoService.getByFileid(fileid);
            ViewMsg msg = ViewMsg.success(viewInfo.getPdfName());
            return msg;
        }else{
            ViewMsg msg = ViewMsg.fail("文件类型不支持");
            return msg;
        }
    }
    public static String getFileNameNoEx(String filename) {
        if ((filename != null) && (filename.length() > 0)) {
            int dot = filename.lastIndexOf('.');
            if ((dot >-1) && (dot < (filename.length()))) {
                return filename.substring(0, dot);
            }
        }
        return filename;
    }

//    public static void main(String[] args) {
//        WordToPdf.doc2pdf("C:\\Users\\mmciel\\Desktop\\213.docx","C:\\Users\\mmciel\\Desktop\\213.pdf");
//
//    }
//    public static void s(){
//        WordToPdf.doc2pdf("C:\\Users\\mmciel\\Desktop\\213.docx","C:\\Users\\mmciel\\Desktop\\213.pdf");
//
//    }
}
