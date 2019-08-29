package com.yisoo.bean;

import java.util.List;

public class DownMsg {
    private String result;
    private String message;
    private String url;
    private String type;
    private String filename;
    private List<DownLog> logs;

    public static DownMsg success(String type,String url,String filename,List<DownLog> logs){
        DownMsg downMsg = new DownMsg();
        downMsg.filename = filename;
        downMsg.message = "success";
        downMsg.url = "down/action?downid="+url+"&type="+type;
        downMsg.result ="200";
        downMsg.logs = logs;
        return downMsg;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public List<DownLog> getLogs() {
        return logs;
    }

    public void setLogs(List<DownLog> logs) {
        this.logs = logs;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
