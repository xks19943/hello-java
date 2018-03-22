package com.liaoye.demo_03;
/*
 * 获取任意一年的二月有多少天
 *
 * 分析：
 * 		A:键盘录入任意的年份
 * 		B:设置日历对象的年月日
 * 			年就是A输入的数据
 * 			月是2
 * 			日是1
 * 		C:把时间往前推一天，就是2月的最后一天
 * 		D:获取这一天输出即可
 */

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入要计算的年份：");
        String yearStr = scanner.nextLine();

        int year = Integer.parseInt(yearStr);

        Calendar calendar = Calendar.getInstance();
        /*求出3月份第一天*/
        calendar.set(year,2,1);
        /*3月份往前推一天就是2月的最后一天*/
        calendar.add(Calendar.DATE,-1);
        int date = calendar.get(Calendar.DATE);

        System.out.println(year + "的2月有：" + date + "天");
    }
}
