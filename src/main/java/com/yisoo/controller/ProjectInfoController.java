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

import java.util.List;

@Controller
public class ProjectInfoController {
    @Autowired
    ProjectInfoService projectInfoService;

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
        ProjectMsg success = ProjectMsg.success();
        return success;

    }
}
