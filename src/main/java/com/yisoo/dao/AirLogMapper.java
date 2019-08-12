package com.yisoo.dao;

import com.yisoo.bean.AirLog;
import com.yisoo.bean.AirLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirLogMapper {
    long countByExample(AirLogExample example);

    int deleteByExample(AirLogExample example);

    int insert(AirLog record);

    int insertSelective(AirLog record);

    List<AirLog> selectByExample(AirLogExample example);

    int updateByExampleSelective(@Param("record") AirLog record, @Param("example") AirLogExample example);

    int updateByExample(@Param("record") AirLog record, @Param("example") AirLogExample example);
}