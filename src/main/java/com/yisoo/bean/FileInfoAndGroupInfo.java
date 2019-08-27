package com.yisoo.bean;

public class FileInfoAndGroupInfo extends FileInfo {
    private String gNumber;

    private String gName;

    private String gGroup;

    private String gEmail;

    public FileInfoAndGroupInfo(FileInfo u, GroupInfo g){

        this.setFileId(u.getFileId());
        this.setFileMd5(u.getFileMd5());
        this.setFileName(u.getFileName());
        this.setFilePerm(u.getFilePerm());
        this.setFileSize(u.getFileSize());
        this.setProjectId(u.getProjectId());
        this.setFileCreate(u.getFileCreate());
        this.setFileSuffix(u.getFileSuffix());

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
