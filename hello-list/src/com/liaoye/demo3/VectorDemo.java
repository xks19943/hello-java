package com.liaoye.demo3;
/*
 * List的子类特点：
 * 		ArrayList:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程不安全，效率高
 * 		Vector:
 * 			底层数据结构是数组，查询快，增删慢
 * 			线程安全，效率低
 * 		LinkedList:
 * 			 底层数据结构是链表，查询慢，增删快
 * 			线程不安全，效率高
 *
 * 案例：
 * 		使用List的任何子类存储字符串或者存储自定义对象并遍历。
 *
 * ArrayList的使用。
 * 		存储字符串并遍历
 */
/*
 * Vector的特有功能：
 * 1：添加功能
 * 		public void addElement(Object obj)		--	add()
 * 2：获取功能
 * 		public Object elementAt(int index)		--  get()
 * 		public Enumeration elements()			--	Iterator iterator()
 * 				boolean hasMoreElements()				hasNext()
 * 				Object nextElement()					next()
 *
 * JDK升级的原因：
 * 		A:安全
 * 		B:效率
 * 		C:简化书写
 */


import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args){
        Vector vector = new Vector();

        vector.addElement("hello");
        vector.addElement("world");
        vector.addElement("java");

        for (int i = 0; i < vector.size(); i++) {
            String s = (String) vector.elementAt(i);
            System.out.println(s);
        }


        Enumeration en = vector.elements(); // 返回的是实现类的对象
        while (en.hasMoreElements()) {
            String s = (String) en.nextElement();
            System.out.println(s);
        }

    }
}
