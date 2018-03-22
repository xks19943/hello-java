package com.liaoye.demo_04;

/*
 * 算一下你来到这个世界多少天?
 *
 * 分析：
 * 		A:键盘录入你的出生的年月日
 * 		B:把该字符串转换为一个日期
 * 		C:通过该日期得到一个毫秒值
 * 		D:获取当前时间的毫秒值
 * 		E:用D-C得到一个毫秒值
 * 		F:把E的毫秒值转换为年
 * 			/1000/60/60/24
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateTestDemo {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入你的出生年月日：");
            String s = scanner.nextLine();

            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date birthDate = sdf.parse(s);
            long birthTime = birthDate.getTime();
            long currentTime = System.currentTimeMillis();
            long tempTime = currentTime - birthTime;
            long day = tempTime / 1000 / 60 / 60 / 24;
            System.out.println("你从出生到现在已经有：" + day + "天了");

        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
