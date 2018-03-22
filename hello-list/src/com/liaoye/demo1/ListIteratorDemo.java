package com.liaoye.demo1;

/*
 * 列表迭代器：
 * 		ListIterator listIterator()：List集合特有的迭代器
 * 		该迭代器继承了Iterator迭代器，所以，就可以直接使用hasNext()和next()方法。
 *
 * 特有功能：
 * 		Object previous():获取上一个元素
 * 		boolean hasPrevious():判断是否有元素
 *
 * 		注意：ListIterator可以实现逆向遍历，但是必须先正向遍历，才能逆向遍历，所以一般无意义，不使用。
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args){
        // 创建List集合对象
        List list = new ArrayList();
        list.add("hello");
        list.add("world");
        list.add("java");


        // 迭代器
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String s = (String) it.next();
            System.out.println(s);
        }

        ListIterator listIterator = list.listIterator();
        while (listIterator.hasPrevious()){
            String s = (String) listIterator.previous();
            System.out.println(s);
        }
    }
}
