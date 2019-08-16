package com.yisoo.test;

import com.yisoo.bean.GroupInfo;
import com.yisoo.util.ExcelParseUtil;
import org.junit.Test;

import java.util.List;

public class ExcelTest {
    @Test
    public void s(){
        List<GroupInfo> groupInfoLists = ExcelParseUtil.getGroupInfoLists("C:\\Users\\mmciel\\Desktop\\example.xlsx");
        for(GroupInfo i:groupInfoLists){
            System.out.println(i);
        }
    }
}
