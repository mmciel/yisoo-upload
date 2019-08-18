package com.yisoo.bean;


import java.util.List;

public class ProjectInfoTableMsg {
    private String code;
    private String msg;
    private String count;
    private List<ProjectInfo> data;
    public static ProjectInfoTableMsg success(){
        ProjectInfoTableMsg pageInfoTableMsg = new ProjectInfoTableMsg();
        pageInfoTableMsg.code = "0";
        pageInfoTableMsg.msg = "success";
        return pageInfoTableMsg;
    }
    public static ProjectInfoTableMsg fail(){
        ProjectInfoTableMsg pageInfoTableMsg = new ProjectInfoTableMsg();
        pageInfoTableMsg.code = "400";
        pageInfoTableMsg.msg = "fail";
        return pageInfoTableMsg;
    }
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<ProjectInfo> getData() {
        return data;
    }

    public void setData(List<ProjectInfo> data) {
        this.data = data;
    }
}
