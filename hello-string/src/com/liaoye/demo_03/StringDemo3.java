package com.liaoye.demo_03;

/**
 * * 字符串如果是变量相加，先开空间，在拼接。
 * 字符串如果是常量相加，是先加，然后在常量池找，如果有就直接返回，否则，就创建。
 */
public class StringDemo3 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        String s3 = "helloworld";
        System.out.println(s3 == s1 + s2);// false  ==:比较引用类型比较的是地址值是否相同
        System.out.println(s3.equals((s1 + s2)));// true  equals:比较引用类型比较的是内容是否相同

        System.out.println(s3 == "hello" + "world");// false 这个我们错了，应该是true
        System.out.println(s3.equals("hello" + "world"));// true

        // 通过反编译看源码，我们知道这里已经做好了处理。
        // System.out.println(s3 == "helloworld");
        // System.out.println(s3.equals("helloworld"));
    }
}
