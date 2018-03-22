package com.liaoye.demo_02;

/*
 * 字符串的特点：一旦被赋值，就不能改变。
 *
 * * String s = new String(“hello”)和String s = “hello”;的区别?
 * 有。前者会创建2个对象，后者创建1个对象。
 *
 * ==:比较引用类型比较的是地址值是否相同
 * equals:比较引用类型默认也是比较地址值是否相同，而String类重写了equals()方法，比较的是内容是否相同
 */
public class StringDemo2 {
    public static void main(String[] args) {
        String s = "hello";
        s += "world";
        System.out.println("s:" + s); // helloworld

        String s1 = new String("xixi");
        String s2 = new String("xixi");

        String s3 = "xixi";

        String s4 = "xixi";
        String s5 = s1;
        String s6 = s3;

        System.out.println(s1 == s2);  //false   两个指向不同的对象
        System.out.println(s1 == s3);  // false  一个对象  一个常量
        System.out.println(s1 == s5);  // true  两个引用指向同一个对象

        System.out.println("------");

        System.out.println(s3 == s4);   // true
        System.out.println(s4 == s6);   //true
        System.out.println(s3 == s6);   //true



        System.out.println("------");

        System.out.println(s1.equals(s2));  //true
        System.out.println(s1.equals(s3));  //true
        System.out.println(s2.equals(s3));  //true
        System.out.println(s1.equals(s4));  //true
        System.out.println(s5.equals(s4));  //true
    }
}
