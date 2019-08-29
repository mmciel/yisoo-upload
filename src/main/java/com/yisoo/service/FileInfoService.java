package com.yisoo.service;

import com.yisoo.bean.FileInfo;
import com.yisoo.bean.FileInfoExample;
import com.yisoo.dao.FileInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FileInfoService {
    @Autowired
    FileInfoMapper fileInfoMapper;

//    增
    public void add(FileInfo fileInfo){
        fileInfoMapper.insertSelective(fileInfo);
    }
//    删
    public void del(Integer fileId){
        fileInfoMapper.deleteByPrimaryKey(fileId);
    }
//    改
    public void update(FileInfo fileInfo){
        fileInfoMapper.updateByPrimaryKey(fileInfo);
    }
//    查
    public FileInfo get(Integer fileId){
        return fileInfoMapper.selectByPrimaryKey(fileId);
    }
//    根据文件MD5查数据项
    public FileInfo getByMd5(String Md5){
        FileInfoExample example = new FileInfoExample();
        FileInfoExample.Criteria criteria = example.createCriteria();
        criteria.andFileMd5EqualTo(Md5);
        return fileInfoMapper.selectByExample(example).get(0);
    }
//    计算数据项
    public Integer countfileInfoByProjectId(Integer projectid){
        FileInfoExample example = new FileInfoExample();
        FileInfoExample.Criteria criteria = example.createCriteria();
        criteria.andProjectIdEqualTo(projectid);
        criteria.andFileTypeEqualTo(1);
        return (int)fileInfoMapper.countByExample(example);
    }
    public List<FileInfo> getByProjectid(Integer projectid){
        FileInfoExample example = new FileInfoExample();
        FileInfoExample.Criteria criteria = example.createCriteria();
        criteria.andProjectIdEqualTo(projectid);
        criteria.andFileTypeEqualTo(1);
        return fileInfoMapper.selectByExample(example);
    }
}
