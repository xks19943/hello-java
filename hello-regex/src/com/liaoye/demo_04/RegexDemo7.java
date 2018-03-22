package com.liaoye.demo_04;

/*
 * 获取功能
 *		Pattern和Matcher类的使用
 *
 *		模式和匹配器的基本使用顺序
 */

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo7 {
    public static void main(String[] args){
        // 模式和匹配器的典型调用顺序
        // 把正则表达式编译成模式对象
        // X* X，零次或多次
        Pattern pattern = Pattern.compile("a*b");
        Matcher matcher = pattern.matcher("aaab");
        boolean b = matcher.matches();
        System.out.println(b);

        boolean b1 = Pattern.matches("a*b", "b");
        System.out.println(b1);
    }
}
