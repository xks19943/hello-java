package com.liaoye.demo_03;

/*
 *	protected void finalize()：
 *  	当垃圾回收器确定不存在对该对象的更多引用时，由对象的垃圾回收器调用此方法。
 *  	用于垃圾回收，但是什么时候回收不确定。
 *
 *	protected Object clone():创建并返回此对象的一个副本。
 *		A:重写该方法
 *
 *
 *  Cloneable:此类实现了 Cloneable 接口，以指示 Object.clone() 方法可以合法地对该类实例进行按字段复制。
 *  	这个接口是标记接口，告诉我们实现该接口的类就可以实现对象的复制了。
 *
 *  protected修饰的方法 方法只能在当前包和当前的子包调用
 */

public class StudentTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student("小明",19);

        //clone方法类似于深拷贝  就是地址都变了  只是参数值没变，对象的复制
        Student s2 = (Student) s1.clone();

        //这个只是引用的复制，和s1指向同一个对象
        Student s3 = s1;

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        s3.setName("小李");
        s3.setAge(20);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());

        System.out.println(s1.getName()+"------"+s1.getAge());
        System.out.println(s2.getName()+"------"+s2.getAge());
        System.out.println(s3.getName()+"------"+s3.getAge());

    }
}
