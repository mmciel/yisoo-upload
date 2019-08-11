package com.yisoo.bean;

public class UplaodMsg {
//    文件唯一id
    private int id;
//    上传状态
    private String result;
//    消息
    private String message;
//    url
    private String url;

   public static UplaodMsg success(){
       UplaodMsg uplaodMsg = new UplaodMsg();
       uplaodMsg.setResult("success");
       return uplaodMsg;
   }
    public static UplaodMsg fail(){
       UplaodMsg uplaodMsg = new UplaodMsg();
       uplaodMsg.setResult("failed");
       return uplaodMsg;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
