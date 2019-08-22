package com.yisoo.service;

import com.yisoo.bean.UploadInfo;
import com.yisoo.bean.UploadInfoExample;
import com.yisoo.dao.UploadInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Service
public class UploadInfoService {
    @Autowired
    UploadInfoMapper uploadInfoMapper;
//    增
    public void add(UploadInfo uploadInfo){
        uploadInfoMapper.insertSelective(uploadInfo);
    }
//    删
    public void del(Integer uploadId){
        uploadInfoMapper.deleteByPrimaryKey(uploadId);
    }
//    改
    public void update(UploadInfo uploadInfo){
        uploadInfoMapper.updateByPrimaryKeySelective(uploadInfo);
    }
//    查
    public void get(Integer uploadId){
        uploadInfoMapper.selectByPrimaryKey(uploadId);
    }
//    根据file_id 与g_id查
    public UploadInfo getByOtherId(Integer fileId, Integer gId){
        UploadInfoExample example = new UploadInfoExample();
        UploadInfoExample.Criteria criteria = example.createCriteria();
        criteria.andFileIdEqualTo(fileId);
        criteria.andGIdEqualTo(gId);
        return uploadInfoMapper.selectByExample(example).get(0);

    }


}
