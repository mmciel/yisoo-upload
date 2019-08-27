package com.yisoo.bean;

import java.util.List;

public class UploadLogMsg {
    private String code;
    private String msg;
    private String count;
    private List<UploadInfoAndGroupInfo> data;

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

    public List<UploadInfoAndGroupInfo> getData() {
        return data;
    }

    public void setData(List<UploadInfoAndGroupInfo> data) {
        this.data = data;
    }

    public static UploadLogMsg success(List<UploadInfoAndGroupInfo> d,String count){
        UploadLogMsg msg = new UploadLogMsg();
        msg.setCode("0");
        msg.setMsg("数据获取成功");
        msg.setData(d);
        msg.setCount(count);
        return msg;
    }
    public static UploadLogMsg fail(){
        UploadLogMsg msg = new UploadLogMsg();
        msg.setCode("400");
        msg.setMsg("数据获取失败");
        return msg;
    }

}
