package com.liaoye.demo_01;

import java.util.Scanner;

/*
 * 校验qq号码.
 * 		1:要求必须是5-15位数字
 * 		2:0不能开头
 *
 * 分析：
 * 		A:键盘录入一个QQ号码
 * 		B:写一个功能实现校验
 * 		C:调用功能，输出结果。
 */
public class RegexDemo {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        System.out.println("输入的内容：" + number + "是否为qq号码：" + checkQQ(number));
    }

    private static boolean checkQQ(String number) {
        boolean flag = true;
        if(number.length() > 5 && number.length() <= 15){
            if(!number.startsWith("0")){
                char[] chs = number.toCharArray();
                for (int i = 0; i < chs.length; i++) {
                    char ch = chs[i];
                    if(!Character.isDigit(ch)){
                        flag = false;
                        break;
                    }
                }
            } else {
               flag = false;
            }
        } else {
          flag = false;
        }

        return flag;
    }
}
