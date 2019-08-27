package com.yisoo.bean;

public class UploadInfoAndGroupInfo extends UploadInfo {
    private String gNumber;

    private String gName;

    private String gGroup;

    private String gEmail;

    public UploadInfoAndGroupInfo(UploadInfo u,GroupInfo g){

        this.setUploadId(u.getUploadId());
        this.setgId(u.getgId());
        this.setFileId(u.getFileId());
        this.setProjectId(u.getProjectId());
        this.setUploadIp(u.getUploadIp());
        this.setUploadTime(u.getUploadTime());

        this.gEmail = g.getgEmail();
        this.gGroup = g.getgGroup();
        this.gName = g.getgName();
        this.gNumber = g.getgNumber();
    }

    public String getgNumber() {
        return gNumber;
    }

    public void setgNumber(String gNumber) {
        this.gNumber = gNumber;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName;
    }

    public String getgGroup() {
        return gGroup;
    }

    public void setgGroup(String gGroup) {
        this.gGroup = gGroup;
    }

    public String getgEmail() {
        return gEmail;
    }

    public void setgEmail(String gEmail) {
        this.gEmail = gEmail;
    }
}
