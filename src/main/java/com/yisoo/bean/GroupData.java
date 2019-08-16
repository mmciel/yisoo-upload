package com.yisoo.bean;

public class GroupData {
    private Integer groupId;

    private Integer yisooId;

    private String gName;

    private Byte isNum;

    private Byte isName;

    private Byte isClass;

    private Byte isEmail;

    private String rootFilePath;

    private String rootFileName;

    private String rootFileType;

    private String rootFileMd5;

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public Integer getYisooId() {
        return yisooId;
    }

    public void setYisooId(Integer yisooId) {
        this.yisooId = yisooId;
    }

    public String getgName() {
        return gName;
    }

    public void setgName(String gName) {
        this.gName = gName == null ? null : gName.trim();
    }

    public Byte getIsNum() {
        return isNum;
    }

    public void setIsNum(Byte isNum) {
        this.isNum = isNum;
    }

    public Byte getIsName() {
        return isName;
    }

    public void setIsName(Byte isName) {
        this.isName = isName;
    }

    public Byte getIsClass() {
        return isClass;
    }

    public void setIsClass(Byte isClass) {
        this.isClass = isClass;
    }

    public Byte getIsEmail() {
        return isEmail;
    }

    public void setIsEmail(Byte isEmail) {
        this.isEmail = isEmail;
    }

    public String getRootFilePath() {
        return rootFilePath;
    }

    public void setRootFilePath(String rootFilePath) {
        this.rootFilePath = rootFilePath == null ? null : rootFilePath.trim();
    }

    public String getRootFileName() {
        return rootFileName;
    }

    public void setRootFileName(String rootFileName) {
        this.rootFileName = rootFileName == null ? null : rootFileName.trim();
    }

    public String getRootFileType() {
        return rootFileType;
    }

    public void setRootFileType(String rootFileType) {
        this.rootFileType = rootFileType == null ? null : rootFileType.trim();
    }

    public String getRootFileMd5() {
        return rootFileMd5;
    }

    public void setRootFileMd5(String rootFileMd5) {
        this.rootFileMd5 = rootFileMd5 == null ? null : rootFileMd5.trim();
    }
}