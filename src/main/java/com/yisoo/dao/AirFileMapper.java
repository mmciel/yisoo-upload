package com.yisoo.dao;

import com.yisoo.bean.AirFile;
import com.yisoo.bean.AirFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirFileMapper {
    long countByExample(AirFileExample example);

    int deleteByExample(AirFileExample example);

    int deleteByPrimaryKey(Integer airId);

    int insert(AirFile record);

    int insertSelective(AirFile record);

    List<AirFile> selectByExample(AirFileExample example);

    AirFile selectByPrimaryKey(Integer airId);

    int updateByExampleSelective(@Param("record") AirFile record, @Param("example") AirFileExample example);

    int updateByExample(@Param("record") AirFile record, @Param("example") AirFileExample example);

    int updateByPrimaryKeySelective(AirFile record);

    int updateByPrimaryKey(AirFile record);
}