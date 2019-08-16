package com.yisoo.test;



import org.apache.commons.codec.digest.DigestUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class AirTest {
    //    @Test
//    public static void main(String[] args){
//        AirTest.FileToAirFile(new File("C:\\Users\\mmciel\\Desktop\\go.bat") );
//    }
//    public static void FileToAirFile (File file){
//        AirFile airFile = new AirFile();
//        airFile.setAirName(file.getName());
//        airFile.setAirSize((int) file.length());
//        airFile.setAirPath(file.getParent());
//        airFile.setAirDate(new Date());
//        try {
//            airFile.setAirMd5(DigestUtils.md5Hex(new FileInputStream(file.getParent()+"\\"+file.getName())));
//        } catch (IOException e) {
//            airFile.setAirMd5("0000000000000000");
//            e.printStackTrace();
//        } finally {
////            System.out.println(airFile);
//        }



//        return null;
//    }
}
