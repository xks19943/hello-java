package com.liaoye.demo_02;
/*
 * public void add(int field,int amount):根据给定的日历字段和对应的时间，来对当前的日历进行操作。
 * public final void set(int year,int month,int date):设置当前日历的年月日
 */

import java.util.Calendar;

public class CalendarDemo2 {
    public static void main(String[] args){
        // 获取当前的日历时间
        Calendar c = Calendar.getInstance();



        c.add(Calendar.YEAR,5);
        c.add(Calendar.DATE,-5);

        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH) + 1;
        int date = c.get(Calendar.DATE);

        System.out.println("5年后5天前的日期为：" + year + "-" + month + "-" + date);

        c.set(2018,7,8);
        year = c.get(Calendar.YEAR);
        month = c.get(Calendar.MONTH) + 1;
        date = c.get(Calendar.DATE);
        System.out.println("设置的日期为：" + year + "-" + month + "-" + date);
    }
}
