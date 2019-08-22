package com.yisoo.controller;

import com.yisoo.service.FileInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class FileInfoController {
    @Autowired
    FileInfoService fileInfoService;


}
