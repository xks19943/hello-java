package com.liaoye.demo_04;
/*
 * 替换功能
 *  	String类的public String replaceAll(String regex,String replacement)
 *  	使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
 */
public class RegexDemo6 {
    public static void main(String[] args){
        // 定义一个字符串
        String s = "helloqq12345worldkh622112345678java";

        String regex = "\\d+";
        String replaceStr = " ";

        String s1 = s.replaceAll(regex, replaceStr);
        System.out.println("替换后的字符串是：" + s1);
    }
}
