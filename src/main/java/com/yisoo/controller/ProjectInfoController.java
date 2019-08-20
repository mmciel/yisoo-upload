package com.yisoo.controller;

import com.github.pagehelper.PageHelper;
import com.yisoo.bean.ProjectInfo;
import com.yisoo.bean.ProjectInfoTableMsg;
import com.yisoo.bean.ProjectMsg;
import com.yisoo.service.ProjectInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class ProjectInfoController {
    @Autowired
    ProjectInfoService projectInfoService;

    //  根据groupid获取数据
    @RequestMapping(value = "pro/get/data", method = RequestMethod.GET)
    @ResponseBody
    public ProjectInfoTableMsg getProjectInfoByKey(
            @RequestParam("projectid") Integer projectid
    ) {
        ProjectInfo projectInfo = projectInfoService.getProjectInfoByKey(projectid);
        List<ProjectInfo> item = new ArrayList<ProjectInfo>();
        item.add(projectInfo);
        ProjectInfoTableMsg success = ProjectInfoTableMsg.success();
        success.setCount(String.valueOf(1));
        success.setData(item);
        return success;
    }

    //  获取数据
    @RequestMapping(value = "pro/view", method = RequestMethod.GET)
    @ResponseBody
    public ProjectInfoTableMsg getProjectInfo(
            @RequestParam("yisooid") Integer yisooid,
            @RequestParam("page") Integer page,
            @RequestParam("limit") Integer limit
    ) {
        Integer temp = projectInfoService.countProjectInfoByYisooId(yisooid);
        PageHelper.startPage(page, limit);
        List<ProjectInfo> item = projectInfoService.getProjectInfByYisooId(yisooid);
        ProjectInfoTableMsg success = ProjectInfoTableMsg.success();
        success.setCount(String.valueOf(temp));
        success.setData(item);
        return success;
    }

    //    删除
    @RequestMapping(value = "pro/del", method = RequestMethod.GET)
    @ResponseBody
    public ProjectMsg delProjectInfo(
            @RequestParam("projectid") Integer projectid
    ) {
//        删除项目信息
        projectInfoService.delProjectInfo(projectid);
//        删除文件信息
        //
        ProjectMsg success = ProjectMsg.success();
        return success;

    }
    //    更新
    @RequestMapping(value = "pro/update", method = RequestMethod.POST)
    @ResponseBody
    public ProjectMsg updateProjectInfo(
            ProjectInfo projectInfo
    ) {
//        System.out.println(projectInfo);
//        更新项目信息
        projectInfoService.updateProjectInfo(projectInfo);
        ProjectMsg success = ProjectMsg.success();
        return success;

    }
    //   添加
    @RequestMapping(value = "pro/add", method = RequestMethod.POST)
    @ResponseBody
    public ProjectMsg setProjectInfo(
            ProjectInfo projectInfo
    ) {
//        ProjectInfo{projectId=null,
//        yisooId=null, pTitle='null', pWord='null', pPath='null',
//        pStatus=null, pGroupId=null, pGroupIsClass=null, pGroupIsName=null,
//        pGroupIsNum=null, pGroupIsEmail=null, isShare=null,
//        isView=null, createTime=null, startTime=null, endTime=null}
//        System.out.println(projectInfo);
//        return null;
        System.out.println(projectInfo);
        projectInfoService.setProjectInfo(projectInfo);
        ProjectInfo projectInfoAndProjectId = projectInfoService.getProjectInfoByProjectInfo(projectInfo);
        projectInfoAndProjectId.setCreateTime(new Date());
        projectInfoAndProjectId.setIsRemove(0);
        projectInfoAndProjectId.setpPath("yid-"+projectInfoAndProjectId.getYisooId()+"-pid-"+projectInfoAndProjectId.getProjectId());
        projectInfoAndProjectId.setpStatus(0);
        projectInfoService.updateProjectInfo(projectInfoAndProjectId);
        ProjectMsg success = ProjectMsg.success();
        return success;
    }
}
