package com.yisoo.bean;

public class ProjectMsg {
    private String result;
    private String message;

    public static ProjectMsg success(){
        ProjectMsg projectMsg = new ProjectMsg();
        projectMsg.setResult("200");
        projectMsg.setMessage("success");
        return projectMsg;
    }
    public static ProjectMsg fail(){
        ProjectMsg projectMsg = new ProjectMsg();
        projectMsg.setResult("400");
        projectMsg.setMessage("fail");
        return projectMsg;
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
