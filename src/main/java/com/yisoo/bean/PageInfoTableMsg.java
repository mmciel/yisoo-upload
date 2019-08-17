package com.yisoo.bean;

import com.github.pagehelper.PageInfo;

import java.util.ArrayList;
import java.util.List;

public class PageInfoTableMsg {
    private String code;
    private String msg;
    private String count;
    private PageInfo data;
    public static PageInfoTableMsg success(){
        PageInfoTableMsg pageInfoTableMsg = new PageInfoTableMsg();
        pageInfoTableMsg.code = "0";
        pageInfoTableMsg.msg = "success";
        return pageInfoTableMsg;
    }
    public static PageInfoTableMsg fail(){
        PageInfoTableMsg pageInfoTableMsg = new PageInfoTableMsg();
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

    public PageInfo getData() {
        return data;
    }

    public void setData(PageInfo data) {
        this.data = data;
    }
}
