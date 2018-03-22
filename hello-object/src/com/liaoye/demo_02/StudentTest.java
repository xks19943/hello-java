package com.liaoye.demo_02;

/**
 * * ==:
 * 		基本类型：比较的就是值是否相同
 * 		引用类型：比较的就是地址值是否相同
 * equals:
 * 		引用类型：默认情况下，比较的是地址值。
 * 	  可以通过重写方法来比较。
 *
 */

public class StudentTest {
    public static void main(String[] args){
        Student s1 = new Student("小明", 18);
        Student s2 = new Student("小明", 18);

        Student s3 = s1;
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));


    }
}
