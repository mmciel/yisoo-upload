package com.yisoo.service;

import com.yisoo.bean.UploadInfo;
import com.yisoo.bean.UploadInfoExample;
import com.yisoo.dao.UploadInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

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
//    查询项目内所有提交记录
    public List<UploadInfo> getByProjectid(Integer projectid){
        UploadInfoExample example = new UploadInfoExample();
        UploadInfoExample.Criteria criteria = example.createCriteria();
        criteria.andProjectIdEqualTo(projectid);
        return uploadInfoMapper.selectByExample(example);
    }
//    根据file_id 与g_id查
    public UploadInfo getByOtherId(Integer fileId, Integer gId){
        UploadInfoExample example = new UploadInfoExample();
        UploadInfoExample.Criteria criteria = example.createCriteria();
        criteria.andFileIdEqualTo(fileId);
        criteria.andGIdEqualTo(gId);
        return uploadInfoMapper.selectByExample(example).get(0);

    }
    public UploadInfo checkOldUpload(Integer projectid,Integer gid){
        UploadInfoExample example = new UploadInfoExample();
        UploadInfoExample.Criteria criteria = example.createCriteria();
        criteria.andProjectIdEqualTo(projectid);
        criteria.andGIdEqualTo(gid);
        List<UploadInfo> uploadInfos = uploadInfoMapper.selectByExample(example);
        if(uploadInfos.size() == 0){
            return  null;
        }
        return uploadInfos.get(uploadInfos.size()-1);
    }


    public Integer countuploadInfoByProjectId(Integer projectid) {
        UploadInfoExample example = new UploadInfoExample();
        UploadInfoExample.Criteria criteria = example.createCriteria();
        criteria.andProjectIdEqualTo(projectid);
        return (int)uploadInfoMapper.countByExample(example);
    }
}
