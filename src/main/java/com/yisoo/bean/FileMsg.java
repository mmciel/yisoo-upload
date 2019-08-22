package com.yisoo.bean;

public class FileMsg {
    private String result;
    private String message;
    private String fileId;
    private FileInfo fileInfo;
    private UploadInfo uploadInfo;

    public static FileMsg success(){
        FileMsg fileMsg = new FileMsg();
        fileMsg.setResult("200");
        return fileMsg;
    }
    public static FileMsg fail(){
        FileMsg fileMsg = new FileMsg();
        fileMsg.setResult("400");
        return fileMsg;
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

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public FileInfo getFileInfo() {
        return fileInfo;
    }

    public void setFileInfo(FileInfo fileInfo) {
        this.fileInfo = fileInfo;
    }

    public UploadInfo getUploadInfo() {
        return uploadInfo;
    }

    public void setUploadInfo(UploadInfo uploadInfo) {
        this.uploadInfo = uploadInfo;
    }
}
