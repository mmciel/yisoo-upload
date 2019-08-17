package com.yisoo.bean;

import java.util.ArrayList;
import java.util.List;

public class GroupDataTableMsg {
    private String code;
    private String msg;
    private String count;
    private List<GroupData> data = new ArrayList<GroupData>();

    public static GroupDataTableMsg success(){
        GroupDataTableMsg groupDataTableMsg = new GroupDataTableMsg();
        groupDataTableMsg.code = "0";
        groupDataTableMsg.msg = "success";
        return groupDataTableMsg;
    }
    public static GroupDataTableMsg fail(){
        GroupDataTableMsg groupDataTableMsg = new GroupDataTableMsg();
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

    public List<GroupData> getData() {
        return data;
    }

    public void setData(List<GroupData> data) {
        this.data = data;
    }
}
