package com.yisoo.test;

import org.junit.Test;

import java.io.File;

public class FileTest {
    @Test
    public void s(){
        File NewFile = new File("D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\project-files\\re-submit\\541707090106_方铄.h");
        File OldFile = new File("D:\\PublicCode\\IDEAWorkspace\\yisoo\\target\\yisoo\\project-files\\yid-3-pid-9\\541707090106_方铄.h");
        boolean b = OldFile.renameTo(NewFile);
    }
}
