package com.yisoo.test;

import org.junit.Test;

import java.util.Date;

public class DataTestcompare {
    @Test
    public void s(){
        Date date1 = new Date();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Date date2 = new Date();
        date2.before(date1);
        System.out.println(date2.before(date1));
    }
}
