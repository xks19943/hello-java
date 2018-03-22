package com.liaoye.demo_01;

import java.util.Scanner;

public class RegexDemo2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println("输入的内容：" + number + "是否为qq号码：" + checkQQ(number));
    }

    private static boolean checkQQ(String number) {
        return number.matches("[0-9]\\d{4,14}");
    }
}
