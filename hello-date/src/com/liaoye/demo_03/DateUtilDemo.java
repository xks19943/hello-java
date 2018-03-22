package com.liaoye.demo_03;

import java.text.ParseException;
import java.util.Date;

public class DateUtilDemo {
    public static void main(String[] args){
        Date d = new Date();

        String date = DateUtil.dateToString(d, "yyyy-MM-dd HH:mm:ss");
        System.out.println("当前时间为:" + date);


        String ds = "2018-08-08 12:13:14";
        try {
            Date date1 = DateUtil.stringToDate(ds, "yyyy-MM-dd HH:mm:ss");
            System.out.println("格式化后的时间为：" + date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
