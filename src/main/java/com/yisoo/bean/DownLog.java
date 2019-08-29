package com.yisoo.bean;

import java.util.Date;

public class DownLog {
    private Integer downId;

    private Date dTime;

    private String dFileparent;

    private String dFilename;

    private String dType;

    private String dIp;

    private Integer projectId;

    private Integer yisooidId;

    private String dMd5;

    private String dHash;

    public Integer getDownId() {
        return downId;
    }

    public void setDownId(Integer downId) {
        this.downId = downId;
    }

    public Date getdTime() {
        return dTime;
    }

    public void setdTime(Date dTime) {
        this.dTime = dTime;
    }

    public String getdFileparent() {
        return dFileparent;
    }

    public void setdFileparent(String dFileparent) {
        this.dFileparent = dFileparent == null ? null : dFileparent.trim();
    }

    public String getdFilename() {
        return dFilename;
    }

    public void setdFilename(String dFilename) {
        this.dFilename = dFilename == null ? null : dFilename.trim();
    }

    public String getdType() {
        return dType;
    }

    public void setdType(String dType) {
        this.dType = dType == null ? null : dType.trim();
    }

    public String getdIp() {
        return dIp;
    }

    public void setdIp(String dIp) {
        this.dIp = dIp == null ? null : dIp.trim();
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getYisooidId() {
        return yisooidId;
    }

    public void setYisooidId(Integer yisooidId) {
        this.yisooidId = yisooidId;
    }

    public String getdMd5() {
        return dMd5;
    }

    public void setdMd5(String dMd5) {
        this.dMd5 = dMd5 == null ? null : dMd5.trim();
    }

    public String getdHash() {
        return dHash;
    }

    public void setdHash(String dHash) {
        this.dHash = dHash == null ? null : dHash.trim();
    }
}