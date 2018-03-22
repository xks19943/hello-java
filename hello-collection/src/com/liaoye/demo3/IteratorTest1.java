package com.liaoye.demo3;

import com.liaoye.demo2.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorTest1 {
    public static void main(String[] args){
        Collection c  = new ArrayList();

        Student s1 = new Student("小明", 18);
        Student s2 = new Student("小王", 17);
        Student s3 = new Student("小李", 16);

        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator iterator = c.iterator();

        while (iterator.hasNext()){
            Student s = (Student) iterator.next();
            System.out.println(s.getName() + "---" + s.getAge());
        }


        /**
         * 使用for循坏来实现 此功能
         */
        for (Iterator iterator1 = c.iterator();iterator1.hasNext();){
            Student stu = (Student) iterator1.next();
            System.out.println(stu.getName() + "---" + stu.getAge());
        }
    }
}
