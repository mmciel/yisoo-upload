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
//        private String email;
        this.setEmail(user.getEmail());
//        private String userPhone;
        this.setUserPhone(user.getUserPhone());
//        private Integer userPerm;
        this.setUserPerm(user.getUserPerm());
//        private Date regTime;
        this.setRegTime(user.getRegTime());
//        private String imgPath;
        this.setImgPath(user.getImgPath());
//        private Integer loginStatus;
        this.setLoginStatus(user.getLoginStatus());
//        private String loginLastIp;
        this.setLoginLastIp(user.getLoginLastIp());
//        private Date loginLastTime;
        this.setLoginLastTime(user.getLoginLastTime());
    }

    public static UserMsg success(User user){
        UserMsg userMsg = new UserMsg(user);
        userMsg.message = "成功";
        userMsg.result = 200;
        return  userMsg;
    }

    public static UserMsg fail(){
        UserMsg userMsg = new UserMsg();
        userMsg.message = "失败";
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
