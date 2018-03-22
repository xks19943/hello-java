package com.liaoye.demo1;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 集合的遍历。其实就是依次获取集合中的每一个元素。
 *
 * Object[] toArray():把集合转成数组，可以实现集合的遍历
 */
public class CollectionDemo3 {
    public static void main(String[] args){
        // 创建集合对象
        Collection c = new ArrayList();

        // 添加元素
        c.add("hello"); // Object obj = "hello"; 向上转型
        c.add("world");
        c.add("java");

        Object[] obj = c.toArray();
        for (int i = 0; i < obj.length; i++) {
            String s = (String) obj[i];
            System.out.println(s + "----" + s.length());
        }
    }
}
