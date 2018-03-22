package com.liaoye.demo_01;

/*
 * Object:类 Object 是类层次结构的根类。每个类都使用 Object 作为超类。
 * 每个类都直接或者间接的继承自Object类。
 *
 * Object类的方法：
 * 		public int hashCode():返回该对象的哈希码值。
 * 			注意：哈希值是根据哈希算法计算出来的一个值，这个值和地址值有关，但是不是实际地址值。
 * 			           你可以理解为地址值。
 *
 *		public final Class getClass():返回此 Object 的运行时类
 *			Class类的方法：
 *				public String getName()：以 String 的形式返回此 Class 对象所表示的实体
 *
 *	    public String toString():返回该对象的字符串表示
 *          默认表示为：this.getClass().getName()+'@'+Integer.toHexString(this.hashCode())
 *          要输错其他得重写toString方法。
 *	    Integer类下的一个静态方法：
 * 		public static String toHexString(int i)：把一个整数转成一个十六进制表示的字符串
 *	    	
 */

public class StudentTest {
    public static void main(String[] args){
        Student student = new Student();
        Student s = new Student();
        Student s2 = student;


        System.out.println(student.hashCode()+"");
        System.out.println(s2.hashCode()+"");
        System.out.println(s.hashCode()+"");

        //将整数转换为16进制的字符串
        System.out.println(Integer.toHexString(s.hashCode()));

        System.out.println(student.getClass().getName());
        System.out.println(s2.getClass().getName());
        System.out.println(s.getClass().getName());

        System.out.println(s.toString());

    }
}
