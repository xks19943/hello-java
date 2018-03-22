package com.liaoye.demo2;

/*
 * 需求：存储自定义对象，并保证元素的唯一性
 * 要求：如果两个对象的成员变量值都相同，则为同一个元素。
 *
 * 目前是不符合我的要求的：因为我们知道HashSet底层依赖的是hashCode()和equals()方法。
 * 而这两个方法我们在学生类中没有重写，所以，默认使用的是Object类。
 * 这个时候，他们的哈希值是不会一样的，根本就不会继续判断，执行了添加操作。
 */


import java.util.HashSet;

public class HashSetDemo1 {
    public static void main(String[] args){
        HashSet<Student> hashSet = new HashSet<>();
        hashSet.add(new Student(17,"小明"));
        hashSet.add(new Student(17,"小明"));
        hashSet.add(new Student(18,"小王"));
        hashSet.add(new Student(19,"小赵"));
        hashSet.add(new Student(20,"小李"));

        for (Student s : hashSet) {
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
