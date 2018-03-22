package com.liaoye.demo3;

import java.util.LinkedList;

/*
 * LinkedList的特有功能：
 * 		A:添加功能
 * 			public void addFirst(Object e)
 * 			public void addLast(Object e)
 * 		B:获取功能
 * 			public Object getFirst()
 * 			public Obejct getLast()
 * 		C:删除功能
 * 			public Object removeFirst()
 * 			public Object removeLast()
 */

public class LinkedListDemo {
    public static void main(String[] args){
        // 创建集合对象
        LinkedList list = new LinkedList();

        // 添加元素
        list.add("hello");
        list.add("world");
        list.add("java");

        /*first 是往头部添加 last是往尾部添加*/
        list.addFirst("study");
        list.addLast("hard");



        System.out.println(list);


        System.out.println("第一个元素是:" + list.getFirst());
        System.out.println("最后一个元素是:" + list.getLast());
        /*删除头部的元素*/
        list.removeFirst();
        /*删除尾部的元素*/
        list.removeLast();

        System.out.println(list);
    }
}
