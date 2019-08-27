package com.yisoo.bean;

import java.util.List;

public class UploadSolveMsg {
    private String code;
    private String msg;
    private String count;
    private List<FileInfoAndGroupInfo> data;

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

    public List<FileInfoAndGroupInfo> getData() {
        return data;
    }

    public void setData(List<FileInfoAndGroupInfo> data) {
        this.data = data;
    }

    public static UploadSolveMsg success(List<FileInfoAndGroupInfo> d, String count){
        UploadSolveMsg msg = new UploadSolveMsg();
        msg.setCode("0");
        msg.setMsg("数据获取成功");
        msg.setData(d);
        msg.setCount(count);
        return msg;
    }
    public static UploadSolveMsg fail(){
        UploadSolveMsg msg = new UploadSolveMsg();
        msg.setCode("400");
        msg.setMsg("数据获取失败");
        return msg;
    }

}
