package com.liaoye.demo6;

/*
 * 如果一个类的元素要想能够进行自然排序，就必须实现自然排序接口
 */
public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        // 这里返回什么，其实应该根据我的排序规则来做
        // 按照年龄排序,主要条件
        int num = this.age - o.age;
        // 次要条件
        // 年龄相同的时候，还得去看姓名是否也相同
        // 如果年龄和姓名都相同，才是同一个元素
        int num2 = num == 0 ? this.name.compareTo(o.name) : num;
        return num2;
    }
}
