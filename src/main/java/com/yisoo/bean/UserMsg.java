package com.yisoo.bean;

import org.junit.Test;

import java.util.Date;

public class UserMsg  extends User {//
    //  登录结果
    private Integer result;
    //  回调信息
    private String message;


    public UserMsg() {

    }

    public UserMsg(User user){
//        private Integer yisooId;
        this.setYisooId(user.getYisooId());
//        private String userId;
        this.setUserId(user.getUserId());
//        private String username;
        this.setUsername(user.getUsername());
    }

    public static UserMsg success(User user){
        UserMsg userMsg = new UserMsg(user);
        userMsg.message = "登录成功";
        userMsg.result = 200;
        return  userMsg;
    }

    public static UserMsg fail(){
        UserMsg userMsg = new UserMsg();
        userMsg.message = "登录失败";
        userMsg.result = 400;
        return  userMsg;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
