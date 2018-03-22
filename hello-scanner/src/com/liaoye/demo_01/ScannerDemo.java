package com.liaoye.demo_01;


/**
 * 基本格式：
 * 		public boolean hasNextXxx():判断是否是某种类型的元素
 * 		public Xxx nextXxx():获取该元素
 * 	    public String nextLine():获取一个String类型的值
 * 	    public int nextInt():获取一个int类型的值
 * 	InputMismatchException：输入的和你想要的不匹配
 **/

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Scanner sc2 = new Scanner(System.in);
        String s = sc2.nextLine();
        System.out.println("a:" + a + ",s:" + s);
    }
}
