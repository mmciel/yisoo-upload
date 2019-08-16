package com.yisoo.bean;

import java.util.List;

public class GroupMsg {
//    groupID
    private String groupid;

    private String yisooid;
//    返回码
    private String result;
//    返回信息
    private String message;
//    返回文件信息
    private GroupData groupData;
//    返回文件数据
    private List<GroupInfo> datas;
//    返回样例文件名
    private String ExampleFileName;


//    将数据包返回
    public static GroupMsg getGroupListsSuccess(List<GroupInfo> groupInfos,String groupid){
        GroupMsg groupMsg = new GroupMsg();
        groupMsg.setMessage("数据返回成功");
        groupMsg.setResult("ok");
        groupMsg.setGroupid(groupid);
        groupMsg.setDatas(groupInfos);
        return groupMsg;
    }
//    返回成功与消息
    public static GroupMsg getSuccess( ){
        GroupMsg groupMsg = new GroupMsg();
        groupMsg.setMessage("信息提交成功");
        groupMsg.setResult("ok");
        return groupMsg;
    }
//    成功获取样例文件的文件名
    public static GroupMsg getExamplFileSuccess(GroupMsg groupMsg){
        groupMsg.setResult("200");
        groupMsg.setMessage("样例文件获取成功");
        return groupMsg;
    }

    //    成功获取样例文件的文件名
    public static GroupMsg getExamplFileFail(GroupMsg groupMsg){
        groupMsg.setResult("400");
        groupMsg.setMessage("样例文件获取失败");
        return groupMsg;
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

    public GroupData getGroupData() {
        return groupData;
    }

    public void setGroupData(GroupData groupData) {
        this.groupData = groupData;
    }

    public List<GroupInfo> getDatas() {
        return datas;
    }

    public void setDatas(List<GroupInfo> datas) {
        this.datas = datas;
    }

    public String getExampleFileName() {
        return ExampleFileName;
    }

    public void setExampleFileName(String exampleFileName) {
        ExampleFileName = exampleFileName;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getYisooid() {
        return yisooid;
    }

    public void setYisooid(String yisooid) {
        this.yisooid = yisooid;
    }
}
