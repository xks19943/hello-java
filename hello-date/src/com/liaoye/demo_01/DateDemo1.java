package com.liaoye.demo_01;

import java.util.Date;

/*
 * Date:表示特定的瞬间，精确到毫秒。
 *
 * 构造方法：
 * 		Date():根据当前的默认毫秒值创建日期对象
 * 		Date(long date)：根据给定的毫秒值创建日期对象
 *
 *
 */

/*
 * public long getTime():获取时间，以毫秒为单位
 * public void setTime(long time):设置时间
 *
 * 从Date得到一个毫秒值
 * 		getTime()
 * 把一个毫秒值转换为Date
 * 		构造方法
 * 		setTime(long time)
 */
public class DateDemo1 {
    public static void main(String[] args){
        Date d1 = new Date();
        System.out.println("d1:" + d1);

        long time = 1000 * 60 * 60; // 1小时
        Date d2 = new Date(time);
        System.out.println("d2:" + d2);

        long t2 = new Date().getTime();
        System.out.println("t2:" + t2);

        Date d3 = new Date();
        d3.setTime(2000);
        System.out.println("d3" + d3);
    }
}
