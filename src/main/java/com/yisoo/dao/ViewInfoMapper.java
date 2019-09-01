package com.yisoo.dao;

import com.yisoo.bean.ViewInfo;
import com.yisoo.bean.ViewInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ViewInfoMapper {
    long countByExample(ViewInfoExample example);

    int deleteByExample(ViewInfoExample example);

    int deleteByPrimaryKey(Integer viewId);

    int insert(ViewInfo record);

    int insertSelective(ViewInfo record);

    List<ViewInfo> selectByExample(ViewInfoExample example);

    ViewInfo selectByPrimaryKey(Integer viewId);

    int updateByExampleSelective(@Param("record") ViewInfo record, @Param("example") ViewInfoExample example);

    int updateByExample(@Param("record") ViewInfo record, @Param("example") ViewInfoExample example);

    int updateByPrimaryKeySelective(ViewInfo record);

    int updateByPrimaryKey(ViewInfo record);
}