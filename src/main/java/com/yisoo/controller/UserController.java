package com.yisoo.controller;

import com.yisoo.bean.UserMsg;
import com.yisoo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;

//    登录校验
    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @ResponseBody
    public UserMsg LoginCheck(
        @RequestParam("userid")String userid,
        @RequestParam("password")String password
    ){

        return UserMsg.fail();
    }
}
