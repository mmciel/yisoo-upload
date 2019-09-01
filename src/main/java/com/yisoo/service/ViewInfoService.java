package com.yisoo.service;

import com.yisoo.bean.ViewInfo;
import com.yisoo.bean.ViewInfoExample;
import com.yisoo.dao.ViewInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViewInfoService {
    @Autowired
    ViewInfoMapper viewInfoMapper;

    public void add(ViewInfo viewInfo){
        viewInfoMapper.insertSelective(viewInfo);
    }
    public ViewInfo get(Integer viewid){
        return viewInfoMapper.selectByPrimaryKey(viewid);
    }
    public ViewInfo getByFileid(Integer fileid){
//        System.out.println(fileid);

        ViewInfoExample example = new ViewInfoExample();
        ViewInfoExample.Criteria criteria = example.createCriteria();
        criteria.andFileIdEqualTo(fileid);
        List<ViewInfo> viewInfos = viewInfoMapper.selectByExample(example);
        if (viewInfos.size() == 0){
            return null;
        }

        return viewInfos.get(0);
    }
}
