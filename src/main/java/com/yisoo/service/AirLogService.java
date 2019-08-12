package com.yisoo.service;

import com.yisoo.bean.AirLog;
import com.yisoo.dao.AirLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirLogService {
    @Autowired
    AirLogMapper airLogMapper;

    public void addAirLog(AirLog airLog){
        airLogMapper.insertSelective(airLog);
    }
}
