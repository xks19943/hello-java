package com.liaoye.demo1;

/*
 * 集合的嵌套遍历
 * 需求：
 * 		我们班有学生，每一个学生是不是一个对象。所以我们可以使用一个集合表示我们班级的学生。ArrayList<Student>
 * 		但是呢，我们旁边是不是还有班级，每个班级是不是也是一个ArrayList<Student>。
 * 		而我现在有多个ArrayList<Student>。也要用集合存储，怎么办呢?
 * 		就是这个样子的：ArrayList<ArrayList<Student>>
 */

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest1 {
    public static void main(String[] args){
        ArrayList<ArrayList<Student>> classList = new ArrayList<>();

        ArrayList<Student> studentList1 = new ArrayList<>();
        studentList1.add(new Student("小王",12));
        studentList1.add(new Student("小李",11));

        ArrayList<Student> studentList2 = new ArrayList<>();
        studentList2.add(new Student("小赵",10));
        studentList2.add(new Student("小爱",13));

        classList.add(studentList1);
        classList.add(studentList2);

        Iterator<ArrayList<Student>> iterator = classList.iterator();
        while (iterator.hasNext()){
            ArrayList<Student> students = iterator.next();
            Iterator<Student> studentIterator = students.iterator();
            while (studentIterator.hasNext()){
                Student student = studentIterator.next();
                System.out.println(student.getName() + "---" + student.getAge());
            }
        }
    }

}
