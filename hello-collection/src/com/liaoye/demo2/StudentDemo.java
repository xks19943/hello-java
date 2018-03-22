package com.liaoye.demo2;

import java.util.ArrayList;
import java.util.Collection;

public class StudentDemo {
    public static void main(String[] args){
        // 创建集合对象
        Collection c = new ArrayList();

        // 创建学生对象
        Student s1 = new Student("林青霞", 27);
        Student s2 = new Student("风清扬", 30);
        Student s3 = new Student("令狐冲", 33);
        Student s4 = new Student("武鑫", 25);
        Student s5 = new Student("刘晓曲", 22);

        // 把学生添加到集合
        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);

        // 把集合转成数组
        Object[] objs = c.toArray();
        // 遍历数组
        for (int x = 0; x < objs.length; x++) {
            // System.out.println(objs[x]);
            Student s = (Student) objs[x];
            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}
