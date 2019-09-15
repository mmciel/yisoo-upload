package com.yisoo.test;

import com.yisoo.util.PathUtil;
import org.junit.Test;

public class PathTest {

    @Test
    public void s(){
//        System.out.println(System.getProperty("file.separator"));
        String solve = PathUtil.solve("C:\\123\\dasd\\dasddsd\\dsd");
        System.out.println(solve);
    }
}
