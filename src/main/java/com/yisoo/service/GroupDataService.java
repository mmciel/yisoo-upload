package com.yisoo.service;

import com.yisoo.bean.GroupData;
import com.yisoo.bean.GroupDataExample;
import com.yisoo.dao.GroupDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.acl.Group;
import java.util.List;

@Service
public class GroupDataService {
    @Autowired
    GroupDataMapper groupDataMapper;

//添加数据项
    public void addGroupData(GroupData groupData){
        groupDataMapper.insertSelective(groupData);
    }
//    获取groupid
    public GroupData getGroupidByMd5(String Md5){
        GroupDataExample groupDataExample = new GroupDataExample();
        GroupDataExample.Criteria criteria = groupDataExample.createCriteria();
        criteria.andRootFileMd5EqualTo(Md5);
        List<GroupData> groupData = groupDataMapper.selectByExample(groupDataExample);
        return groupData.get(0);
    }
    public void updateGroup(GroupData groupData){
        groupDataMapper.updateByPrimaryKeySelective(groupData);
    }
}
