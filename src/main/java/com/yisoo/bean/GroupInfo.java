package com.yisoo.bean;

public class GroupInfo {
    private Integer gId;

    private Integer groupId;

    private String gNumber;

    private String gName;

    private String gGroup;

    private String gEmail;

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getgNumber() {
        return gNumber;
    }

    public void setgNumber(String gNumber) {
        this.gNumber = gNumber == null ? null : gNumber.trim();
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public String getgGroup() {
        return gGroup;
    }

    public void setgGroup(String gGroup) {
        this.gGroup = gGroup == null ? null : gGroup.trim();
    }

    public String getgEmail() {
        return gEmail;
    }

    public void setgEmail(String gEmail) {
        this.gEmail = gEmail == null ? null : gEmail.trim();
    }
}