package com.yisoo.service;

import com.yisoo.bean.AirFile;
import com.yisoo.bean.AirFileExample;
import com.yisoo.dao.AirFileMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirFileService {
    @Autowired
    AirFileMapper airFileMapper;

/**
 * 增删改查
 * addAirFile
 * delAirFile
 * updateFile
 * getAirFile
 */

    /*插入数据*/
    public void addAirFile(AirFile airFile){
        airFileMapper.insertSelective(airFile);
    }
//    通过MD5找id
    public Integer getIdByMd5(String md5){
        AirFileExample airFileExample = new AirFileExample();
        AirFileExample.Criteria criteria = airFileExample.createCriteria();
        criteria.andAirMd5EqualTo(md5);
        List<AirFile> airFiles = airFileMapper.selectByExample(airFileExample);
        return airFiles.get(0).getAirId();
    }
//    通过分享码获取airfile
    public AirFile getAirFlieByShare(String  share){
        AirFileExample airFileExample = new AirFileExample();
        AirFileExample.Criteria criteria = airFileExample.createCriteria();

        criteria.andAirShareEqualTo(share);
        List<AirFile> airFiles = airFileMapper.selectByExample(airFileExample);
        return airFiles.get(0);

    }
//  根据主键获取数据
    public AirFile getAirFileById(Integer id){
        AirFile airFile = airFileMapper.selectByPrimaryKey(id);
        return airFile;

    }
//  根据主键更新数据
    public void updateAirFile(AirFile airFile){
        airFileMapper.updateByPrimaryKeySelective(airFile);
    }
}
