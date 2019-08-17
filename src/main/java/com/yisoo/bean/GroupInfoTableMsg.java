package com.yisoo.bean;

import java.util.ArrayList;
import java.util.List;

public class GroupInfoTableMsg {
    private String code;
    private String msg;
    private String count;
    private List<GroupInfo> data = new ArrayList<GroupInfo>();

    public static GroupInfoTableMsg success(){
        GroupInfoTableMsg groupDataTableMsg = new GroupInfoTableMsg();
        groupDataTableMsg.code = "0";
        groupDataTableMsg.msg = "success";
        return groupDataTableMsg;
    }
    public static GroupInfoTableMsg fail(){
        GroupInfoTableMsg groupDataTableMsg = new GroupInfoTableMsg();
        groupDataTableMsg.code = "400";
        groupDataTableMsg.msg = "fail";
        return groupDataTableMsg;
    }

    @Override
    public String toString() {
        return "GroupDataTableMsg{" +
                "code='" + code + '\'' +
                ", msg='" + msg + '\'' +
                ", count='" + count + '\'' +
                ", data=" + data +
                '}';
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

    public List<GroupInfo> getData() {
        return data;
    }

    public void setData(List<GroupInfo> data) {
        this.data = data;
    }
}
