package com.yisoo.bean;

import java.util.Date;

public class FileInfo {
    private Integer fileId;

    private Integer gId;

    private Integer filePerm;

    private Integer projectId;

    private String fileMd5;

    private String fileName;

    private String fileParent;

    private Double fileSize;

    private Date fileCreate;

    private String fileSuffix;

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getFilePerm() {
        return filePerm;
    }

    public void setFilePerm(Integer filePerm) {
        this.filePerm = filePerm;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5 == null ? null : fileMd5.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileParent() {
        return fileParent;
    }

    public void setFileParent(String fileParent) {
        this.fileParent = fileParent == null ? null : fileParent.trim();
    }

    public Double getFileSize() {
        return fileSize;
    }

    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }

    public Date getFileCreate() {
        return fileCreate;
    }

    public void setFileCreate(Date fileCreate) {
        this.fileCreate = fileCreate;
    }

    public String getFileSuffix() {
        return fileSuffix;
    }

    public void setFileSuffix(String fileSuffix) {
        this.fileSuffix = fileSuffix == null ? null : fileSuffix.trim();
    }
}