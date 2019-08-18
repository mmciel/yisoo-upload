package com.yisoo.dao;

import com.yisoo.bean.ProjectInfo;
import com.yisoo.bean.ProjectInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectInfoMapper {
    long countByExample(ProjectInfoExample example);

    int deleteByExample(ProjectInfoExample example);

    int deleteByPrimaryKey(Integer projectId);

    int insert(ProjectInfo record);

    int insertSelective(ProjectInfo record);

    List<ProjectInfo> selectByExample(ProjectInfoExample example);

    ProjectInfo selectByPrimaryKey(Integer projectId);

    int updateByExampleSelective(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    int updateByExample(@Param("record") ProjectInfo record, @Param("example") ProjectInfoExample example);

    int updateByPrimaryKeySelective(ProjectInfo record);

    int updateByPrimaryKey(ProjectInfo record);
}