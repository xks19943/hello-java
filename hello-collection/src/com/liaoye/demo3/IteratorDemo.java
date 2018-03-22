package com.liaoye.demo3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args){
        //创建集合对象
        Collection c = new ArrayList();

        c.add("hello");
        c.add("world");
        c.add("java");

        Iterator iterator = c.iterator();

        while (iterator.hasNext()){
            String  s = (String) iterator.next();
            System.out.println(s + "---" + s.length());
        }
    }
}
