package com.yisoo.service;

import com.yisoo.bean.GroupInfo;
import com.yisoo.dao.GroupInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GroupInfoService {
    @Autowired
    GroupInfoMapper groupInfoMapper;

    public void addGroupInfo(GroupInfo groupInfo){
        groupInfoMapper.insertSelective(groupInfo);
    }
}
