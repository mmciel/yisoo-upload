package com.yisoo.dao;

import com.yisoo.bean.DownLog;
import com.yisoo.bean.DownLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DownLogMapper {
    long countByExample(DownLogExample example);

    int deleteByExample(DownLogExample example);

    int deleteByPrimaryKey(Integer downId);

    int insert(DownLog record);

    int insertSelective(DownLog record);

    List<DownLog> selectByExample(DownLogExample example);

    DownLog selectByPrimaryKey(Integer downId);

    int updateByExampleSelective(@Param("record") DownLog record, @Param("example") DownLogExample example);

    int updateByExample(@Param("record") DownLog record, @Param("example") DownLogExample example);

    int updateByPrimaryKeySelective(DownLog record);

    int updateByPrimaryKey(DownLog record);
}