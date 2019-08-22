package com.yisoo.service;

import com.yisoo.bean.GroupInfo;
import com.yisoo.bean.GroupInfoExample;
import com.yisoo.dao.GroupInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GroupInfoService {
    @Autowired
    GroupInfoMapper groupInfoMapper;
//    根据主键获取对象
    public  GroupInfo get(Integer gId){
        return groupInfoMapper.selectByPrimaryKey(gId);
    }
//   根据groupid获取all
    public List<GroupInfo> getGroupInfo(Integer groupid){
        GroupInfoExample groupInfoExample = new GroupInfoExample();
        GroupInfoExample.Criteria criteria = groupInfoExample.createCriteria();
        criteria.andGroupIdEqualTo(groupid);
        List<GroupInfo> groupInfos = groupInfoMapper.selectByExample(groupInfoExample);
        return groupInfos;

    }
//添加数据项
    public void addGroupInfo(GroupInfo groupInfo){
        groupInfoMapper.insertSelective(groupInfo);
    }
//    删除数据项
    public void delGroupDataByGroupId(String groupid){
        GroupInfoExample groupInfoExample = new GroupInfoExample();
        GroupInfoExample.Criteria criteria = groupInfoExample.createCriteria();
        criteria.andGroupIdEqualTo(Integer.valueOf(groupid));
        groupInfoMapper.deleteByExample(groupInfoExample);
    }
    //    查找总共条数
    public Integer countGrouPInfo(Integer groupid){
        GroupInfoExample groupInfoExample = new GroupInfoExample();
        GroupInfoExample.Criteria criteria = groupInfoExample.createCriteria();
        criteria.andGroupIdEqualTo(groupid);
        int l = (int)groupInfoMapper.countByExample(groupInfoExample);
        return l;
    }
}
