package com.yisoo.dao;

import com.yisoo.bean.GroupData;
import com.yisoo.bean.GroupDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupDataMapper {
    long countByExample(GroupDataExample example);

    int deleteByExample(GroupDataExample example);

    int deleteByPrimaryKey(Integer groupId);

    int insert(GroupData record);

    int insertSelective(GroupData record);

    List<GroupData> selectByExample(GroupDataExample example);

    GroupData selectByPrimaryKey(Integer groupId);

    int updateByExampleSelective(@Param("record") GroupData record, @Param("example") GroupDataExample example);

    int updateByExample(@Param("record") GroupData record, @Param("example") GroupDataExample example);

    int updateByPrimaryKeySelective(GroupData record);

    int updateByPrimaryKey(GroupData record);
}