package com.yisoo.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yisoo.bean.GroupInfo;
import com.yisoo.bean.GroupInfoTableMsg;
import com.yisoo.service.GroupInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GroupInfoController {
    @Autowired
    GroupInfoService groupInfoService;

    @RequestMapping(value = "group/view/data",method = RequestMethod.GET)
    @ResponseBody
    public GroupInfoTableMsg getGroupInfoAll(
            @RequestParam("groupid")Integer groupid,
            @RequestParam("page")Integer page,
            @RequestParam("limit")Integer limit
    ){
        Integer l = groupInfoService.countGrouPInfo(groupid);
        PageHelper.startPage(page,limit);
        List<GroupInfo> groupInfos = groupInfoService.getGroupInfo(groupid);
        PageInfo<GroupInfo> item = new PageInfo<>(groupInfos,limit);
        GroupInfoTableMsg success = GroupInfoTableMsg.success();
        success.setData(item.getList());
        success.setCount(String.valueOf(l));
        return success;
    }

}
