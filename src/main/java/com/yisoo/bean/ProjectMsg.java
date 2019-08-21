package com.yisoo.bean;

import java.util.List;

public class ProjectMsg {
    private String result;
    private String message;
    private ProjectInfo data;
    private List<GroupInfo> groups;
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
    public static ProjectMsg error(){
        ProjectMsg projectMsg = new ProjectMsg();
        projectMsg.setResult("500");
        return projectMsg;
    }

    public ProjectInfo getData() {
        return data;
    }

    public void setData(ProjectInfo data) {
        this.data = data;
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

    public List<GroupInfo> getGroups() {
        return groups;
    }

    public void setGroups(List<GroupInfo> groups) {
        this.groups = groups;
    }
}
