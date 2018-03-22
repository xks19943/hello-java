package com.liaoye.demo3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 键盘录入多个数据，以0结束，要求在控制台输出这多个数据中的最大值
 */
public class ArrayListTest3 {
    public static void main(String[] args){
        System.out.println("请输入多个数字 输入0结束");
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true){
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();

            int i = Integer.parseInt(s);
            numbers.add(i);
            if(i == 0 ){
                break;
            }
        }
        int max = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) >max){
                max = numbers.get(i);
            }
        }
        System.out.println("输入的值中最大的为：" + max);
    }
}
