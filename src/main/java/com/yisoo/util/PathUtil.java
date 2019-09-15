package com.yisoo.util;

public class PathUtil {

    public final static String OP = System.getProperty("file.separator");

    public static String  solve(String path){
        return path.replace("\\",OP);
    }
}
