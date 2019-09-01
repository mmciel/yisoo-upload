package com.yisoo.bean;

public class ViewMsg {
    private String result;
    private String maessage;
    private String url;

    public static ViewMsg success(String temp){
        ViewMsg viewMsg = new ViewMsg();
        viewMsg.setMaessage("success");
        viewMsg.setUrl(temp);
        viewMsg.setResult("200");
        return viewMsg;
    }
    public static ViewMsg fail(String temp){
        ViewMsg viewMsg = new ViewMsg();
        viewMsg.setMaessage(temp);
        viewMsg.setUrl("error");
        viewMsg.setResult("400");
        return viewMsg;
    }
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getMaessage() {
        return maessage;
    }

    public void setMaessage(String maessage) {
        this.maessage = maessage;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
