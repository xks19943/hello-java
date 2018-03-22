package com.liaoye.demo_02;

/*
 * 需求：请设计一个方法，可以实现获取任意范围内的随机数。
 *
 * 分析：
 * 		A:键盘录入两个数据。
 * 			int strat;
 * 			int end;
 * 		B:想办法获取在start到end之间的随机数
 * 			我写一个功能实现这个效果，得到一个随机数。(int)
 * 		C:输出这个随机数
 */

import java.util.Scanner;

public class MathDemo2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入开始数：");
        int start = sc.nextInt();
        System.out.println("请输入结束数：");
        int end = sc.nextInt();

        for (int x = 0; x < 10; x++) {
            // 调用功能
            int num = getRandom(start, end);
            // 输出结果
            System.out.println(num);
        }

    }

    private static int getRandom(int start, int end) {
        return (int) (Math.random() * (end - start + 1)) + start;
    }
}
