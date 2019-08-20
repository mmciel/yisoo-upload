package com.yisoo.bean;

import java.util.Date;

public class ProjectInfo {
    private Integer projectId;

    private Integer yisooId;

    private String pTitle;

    private String pWord;

    private String pPath;

    private Integer pStatus;

    private Integer pGroupId;

    private Byte pGroupIsClass;

    private Byte pGroupIsName;

    private Byte pGroupIsNum;

    private Byte pGroupIsEmail;

    private Byte isShare;

    private Byte isView;

    private Date createTime;

    private Date startTime;

    private Date endTime;

    private Integer isRemove;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getYisooId() {
        return yisooId;
    }

    public void setYisooId(Integer yisooId) {
        this.yisooId = yisooId;
    }

    public String getpTitle() {
        return pTitle;
    }

    public void setpTitle(String pTitle) {
        this.pTitle = pTitle == null ? null : pTitle.trim();
    }

    public String getpWord() {
        return pWord;
    }

    public void setpWord(String pWord) {
        this.pWord = pWord == null ? null : pWord.trim();
    }

    public String getpPath() {
        return pPath;
    }

    public void setpPath(String pPath) {
        this.pPath = pPath == null ? null : pPath.trim();
    }

    public Integer getpStatus() {
        return pStatus;
    }

    public void setpStatus(Integer pStatus) {
        this.pStatus = pStatus;
    }

    public Integer getpGroupId() {
        return pGroupId;
    }

    public void setpGroupId(Integer pGroupId) {
        this.pGroupId = pGroupId;
    }

    public Byte getpGroupIsClass() {
        return pGroupIsClass;
    }

    public void setpGroupIsClass(Byte pGroupIsClass) {
        this.pGroupIsClass = pGroupIsClass;
    }

    public Byte getpGroupIsName() {
        return pGroupIsName;
    }

    public void setpGroupIsName(Byte pGroupIsName) {
        this.pGroupIsName = pGroupIsName;
    }

    public Byte getpGroupIsNum() {
        return pGroupIsNum;
    }

    public void setpGroupIsNum(Byte pGroupIsNum) {
        this.pGroupIsNum = pGroupIsNum;
    }

    public Byte getpGroupIsEmail() {
        return pGroupIsEmail;
    }

    public void setpGroupIsEmail(Byte pGroupIsEmail) {
        this.pGroupIsEmail = pGroupIsEmail;
    }

    public Byte getIsShare() {
        return isShare;
    }

    public void setIsShare(Byte isShare) {
        this.isShare = isShare;
    }

    public Byte getIsView() {
        return isView;
    }

    public void setIsView(Byte isView) {
        this.isView = isView;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getIsRemove() {
        return isRemove;
    }

    public void setIsRemove(Integer isRemove) {
        this.isRemove = isRemove;
    }
}