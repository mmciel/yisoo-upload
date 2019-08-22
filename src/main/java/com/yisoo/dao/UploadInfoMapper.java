package com.yisoo.dao;

import com.yisoo.bean.UploadInfo;
import com.yisoo.bean.UploadInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UploadInfoMapper {
    long countByExample(UploadInfoExample example);

    int deleteByExample(UploadInfoExample example);

    int deleteByPrimaryKey(Integer uploadId);

    int insert(UploadInfo record);

    int insertSelective(UploadInfo record);

    List<UploadInfo> selectByExample(UploadInfoExample example);

    UploadInfo selectByPrimaryKey(Integer uploadId);

    int updateByExampleSelective(@Param("record") UploadInfo record, @Param("example") UploadInfoExample example);

    int updateByExample(@Param("record") UploadInfo record, @Param("example") UploadInfoExample example);

    int updateByPrimaryKeySelective(UploadInfo record);

    int updateByPrimaryKey(UploadInfo record);
}