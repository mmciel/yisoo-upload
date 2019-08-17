package com.yisoo.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yisoo.bean.GroupInfo;
import com.yisoo.util.ExcelParseUtil;
import org.junit.Test;

import java.util.List;

public class ExcelTest {
    @Test
    public void s(){
        List<GroupInfo> groupInfoLists = ExcelParseUtil.getGroupInfoLists("C:\\Users\\mmciel\\Desktop\\1.xlsx");
        int page = 1;
        int limit = 10;
        PageHelper.startPage(page,10);
        PageInfo<GroupInfo> item = new PageInfo<>(groupInfoLists,limit);
        System.out.println(item);
    }
}
