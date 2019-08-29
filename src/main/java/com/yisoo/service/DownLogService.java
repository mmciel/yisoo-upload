package com.yisoo.service;

import com.yisoo.bean.DownLog;
import com.yisoo.bean.DownLogExample;
import com.yisoo.dao.DownLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import java.util.List;

@Service
public class DownLogService {

    @Autowired
    DownLogMapper downLogMapper;

    public DownLog get(Integer downid ){
        return downLogMapper.selectByPrimaryKey(downid);
    }
    public DownLog getByDownLog(DownLog downLog){
        DownLogExample e = new DownLogExample();
        DownLogExample.Criteria criteria = e.createCriteria();
        criteria.andDFilenameEqualTo(downLog.getdFilename());
        criteria.andDFileparentEqualTo(downLog.getdFileparent());
        criteria.andDIpEqualTo(downLog.getdIp());
        criteria.andDTimeEqualTo(downLog.getdTime());
        List<DownLog> downLogs = downLogMapper.selectByExample(e);
        return  downLogs.get(0);
    }
    public void add(DownLog downLog){
        downLogMapper.insertSelective(downLog);
    }
    public DownLog getByHash(String h,String type){
        DownLogExample e = new DownLogExample();
        DownLogExample.Criteria criteria = e.createCriteria();
        criteria.andDHashEqualTo(h);
        criteria.andDTypeEqualTo(type);
        List<DownLog> downLogs = downLogMapper.selectByExample(e);
        if (downLogs.size() == 0){
            return null;
        }
        return downLogs.get(0);
    }
}
