package com.yisoo.bean;

import java.util.Date;

public class User {
    private Integer yisooId;

    private String userId;

    private String username;

    private String password;

    private String email;

    private String userPhone;

    private Integer userPerm;

    private Date regTime;

    private String imgPath;

    private String other1;

    private String other2;

    private String other3;

    private Integer loginStatus;

    private String loginLastIp;

    private Date loginLastTime;

    public Integer getYisooId() {
        return yisooId;
    }

    public void setYisooId(Integer yisooId) {
        this.yisooId = yisooId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public Integer getUserPerm() {
        return userPerm;
    }

    public void setUserPerm(Integer userPerm) {
        this.userPerm = userPerm;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getImgPath() {
        return imgPath;
    }

    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    public String getOther1() {
        return other1;
    }

    public void setOther1(String other1) {
        this.other1 = other1 == null ? null : other1.trim();
    }

    public String getOther2() {
        return other2;
    }

    public void setOther2(String other2) {
        this.other2 = other2 == null ? null : other2.trim();
    }

    public String getOther3() {
        return other3;
    }

    public void setOther3(String other3) {
        this.other3 = other3 == null ? null : other3.trim();
    }

    public Integer getLoginStatus() {
        return loginStatus;
    }

    public void setLoginStatus(Integer loginStatus) {
        this.loginStatus = loginStatus;
    }

    public String getLoginLastIp() {
        return loginLastIp;
    }

    public void setLoginLastIp(String loginLastIp) {
        this.loginLastIp = loginLastIp == null ? null : loginLastIp.trim();
    }

    public Date getLoginLastTime() {
        return loginLastTime;
    }

    public void setLoginLastTime(Date loginLastTime) {
        this.loginLastTime = loginLastTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "yisooId=" + yisooId +
                ", userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", userPhone='" + userPhone + '\'' +
                ", userPerm=" + userPerm +
                ", regTime=" + regTime +
                ", imgPath='" + imgPath + '\'' +
                ", other1='" + other1 + '\'' +
                ", other2='" + other2 + '\'' +
                ", other3='" + other3 + '\'' +
                ", loginStatus=" + loginStatus +
                ", loginLastIp='" + loginLastIp + '\'' +
                ", loginLastTime=" + loginLastTime +
                '}';
    }
}