package com.yisoo.controller;

import com.yisoo.bean.User;
import com.yisoo.bean.UserMsg;
import com.yisoo.service.UserService;
import com.yisoo.util.IpAddressUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.rmi.server.InactiveGroupException;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/user/update",method = RequestMethod.POST)
    @ResponseBody
    public UserMsg userUpdate(
            @RequestParam("yisooid")Integer yisooid,
            @RequestParam("username")String username,
            @RequestParam("email")String email,
            @RequestParam("userphone")String userphone
            ){
        User user = new User();
        user.setYisooId(yisooid);
        user.setUserPhone(userphone);
        user.setEmail(email);
        user.setUsername(username);
        System.out.println(user);
        userService.updateUser(user);
        return  UserMsg.success(user);
    }


//    登录校验
    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @ResponseBody
    public UserMsg LoginCheck(
        @RequestParam("userid")String userid,
        @RequestParam("password")String password,
        HttpServletRequest request
    ){
        User user = userService.getUserById(userid);
        if(user.getPassword().equals(password)){
//            密码正确
            user.setLoginLastIp(IpAddressUtil.getIpAddress(request));
            user.setLoginStatus(1);
            user.setLoginLastTime(new Date());

//            更新User
            userService.updateUser(user);
//            存入session
            request.getSession().setAttribute("yisooid",user.getYisooId());
            request.getSession().setAttribute("userid",user.getUserId());
            request.getSession().setAttribute("username",user.getUsername());
            request.getSession().setAttribute("email",user.getEmail());
            return UserMsg.success(user);
        }
        else{
//            密码错误
            return UserMsg.fail();
        }

    }
//    修改密码
    @RequestMapping(value = "user/updatepassword",method = RequestMethod.POST)
    @ResponseBody
    public UserMsg updatePassword(
        @RequestParam("yisooid")String yisooid,
        @RequestParam("oldpw")String oldpw,
        @RequestParam("newpw")String newpw
    ){
        User user = userService.getUserByYisoo(Integer.valueOf(yisooid));
        if(user.getPassword().equals(oldpw)){
//            旧密码正确
            user.setPassword(newpw);
            userService.updateUser(user);

            UserMsg msg = UserMsg.success(user);
            msg.setMessage("密码修改成功，请重新登录");
            return msg;
        }else {
//            旧密码错误
            UserMsg msg = UserMsg.fail();
            msg.setMessage("旧密码错误，请重试。");
            return msg;
        }
    }
//    admin再次校验登录哦结果
    @RequestMapping(value = "user/admincheck",method = RequestMethod.POST)
    @ResponseBody
    public UserMsg checkAdmin(
            @RequestParam("yisooid")Integer yisooid,
            @RequestParam("userid")String userid
    ){
//
//        System.out.println("test"+yisooid);
//        System.out.println(userid);
        User user = userService.getUserByYisoo(yisooid);
//        System.out.println(user.getLoginLastTime());
        if(user.getUserId().equals(userid)){
//            校验成功
            return UserMsg.success(user);
        }else{
//            校验失败
            return UserMsg.fail();
        }

    }
    @RequestMapping(value = "/get/user",method = RequestMethod.GET)
    @ResponseBody
    public UserMsg getUser(
            @RequestParam("yisooid") Integer yisooid
    ) {
        User user= userService.getUserByYisoo(yisooid);
        return UserMsg.success(user);
    }
//    注册账号
    @RequestMapping(value = "/user/reg",method = RequestMethod.POST)
    @ResponseBody
    public UserMsg Reg(
            @RequestParam("userid")String userid,
            @RequestParam("password")String password,
            @RequestParam("email")String email,
            @RequestParam("userphone")String userphone
    ){
//        存入对象
        User user = new User();
        user.setUserId(userid);
        user.setEmail(email);
        user.setPassword(password);
        user.setUserPhone(userphone);
        user.setRegTime(new Date());
        user.setLoginStatus(0);
        user.setUserPerm(0);
        user.setUsername("默认用户");

//        存入数据库
        userService.addUser(user);

//        返回消息
        return UserMsg.success(user);
    }
}
