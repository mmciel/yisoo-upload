package com.yisoo.bean;

import java.util.Date;

public class ViewInfo {
    private Integer viewId;

    private Integer fileId;

    private String pdfName;

    private Date vTime;

    private String vIp;

    public Integer getViewId() {
        return viewId;
    }

    public void setViewId(Integer viewId) {
        this.viewId = viewId;
    }

    public Integer getFileId() {
        return fileId;
    }

    public void setFileId(Integer fileId) {
        this.fileId = fileId;
    }

    public String getPdfName() {
        return pdfName;
    }

    public void setPdfName(String pdfName) {
        this.pdfName = pdfName == null ? null : pdfName.trim();
    }

    public Date getvTime() {
        return vTime;
    }

    public void setvTime(Date vTime) {
        this.vTime = vTime;
    }

    public String getvIp() {
        return vIp;
    }

    public void setvIp(String vIp) {
        this.vIp = vIp == null ? null : vIp.trim();
    }

    @Override
    public String toString() {
        return "ViewInfo{" +
                "viewId=" + viewId +
                ", fileId=" + fileId +
                ", pdfName='" + pdfName + '\'' +
                ", vTime=" + vTime +
                ", vIp='" + vIp + '\'' +
                '}';
    }
}