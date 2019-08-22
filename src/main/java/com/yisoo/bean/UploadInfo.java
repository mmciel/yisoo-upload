package com.yisoo.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UploadInfo {
    private Integer uploadId;

    private Integer projectId;

    private Integer gId;

    private Integer fileId;

    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date uploadTime;

    private String uploadIp;

    private String uploadCode;

    public Integer getUploadId() {
        return uploadId;
    }

    public void setUploadId(Integer uploadId) {
        this.uploadId = uploadId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Date getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(Date uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getUploadIp() {
        return uploadIp;
    }

    public void setUploadIp(String uploadIp) {
        this.uploadIp = uploadIp == null ? null : uploadIp.trim();
    }

    public String getUploadCode() {
        return uploadCode;
    }

    public void setUploadCode(String uploadCode) {
        this.uploadCode = uploadCode == null ? null : uploadCode.trim();
    }
}