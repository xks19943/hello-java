package com.liaoye.demo6;

/*
 * TreeSet存储自定义对象并保证排序和唯一。
 *
 * A:你没有告诉我们怎么排序
 * 		自然排序，按照年龄从小到大排序
 * B:元素什么情况算唯一你也没告诉我
 * 		成员变量值都相同即为同一个元素
 */

import java.util.TreeSet;

/*
 * TreeSet存储自定义对象并保证排序和唯一。
 *
 * A:你没有告诉我们怎么排序
 * 		自然排序，按照年龄从小到大排序
 * B:元素什么情况算唯一你也没告诉我
 * 		成员变量值都相同即为同一个元素
 */

public class TreeDemo2 {
    public static void main(String[] args){
        TreeSet<Student> ts = new TreeSet<>();

        ts.add(new Student("小王",22));
        ts.add(new Student("小李",23));
        ts.add(new Student("小赵",22));
        ts.add(new Student("小王",24));
        ts.add(new Student("小王",22));

        for (Student s : ts) {
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
