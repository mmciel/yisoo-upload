package com.yisoo.service;

import com.yisoo.bean.ProjectInfo;
import com.yisoo.bean.ProjectInfoExample;
import com.yisoo.dao.ProjectInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectInfoService {

    @Autowired
    ProjectInfoMapper projectInfoMapper;
//通过yisooid获取ProjectInfo
    public List<ProjectInfo> getProjectInfByYisooId(Integer yisooid){
        ProjectInfoExample projectInfoExample = new ProjectInfoExample();
        ProjectInfoExample.Criteria criteria = projectInfoExample.createCriteria();
        criteria.andYisooIdEqualTo(yisooid);
        List<ProjectInfo> projectInfos = projectInfoMapper.selectByExample(projectInfoExample);
        return projectInfos;
    }
//    通过主键获取数据项
    public ProjectInfo getProjectInfoByKey(Integer projectid){
        return projectInfoMapper.selectByPrimaryKey(projectid);
    }
//    加入数据项
    public void setProjectInfo(ProjectInfo projectInfo){
        projectInfoMapper.insertSelective(projectInfo);
    }
//    yisooid获取条数
    public Integer countProjectInfoByYisooId(Integer yisooid){
        ProjectInfoExample projectInfoExample = new ProjectInfoExample();
        ProjectInfoExample.Criteria criteria = projectInfoExample.createCriteria();
        criteria.andYisooIdEqualTo(yisooid);
        long l = projectInfoMapper.countByExample(projectInfoExample);
        return (int)l;
    }
//    删除一个项目
    public void delProjectInfo(Integer projectid){
        projectInfoMapper.deleteByPrimaryKey(projectid);
    }
//    部分更新一个项目
    public void updateProjectInfo(ProjectInfo projectInfo){
        projectInfoMapper.updateByPrimaryKeySelective(projectInfo);
    }

//

}
