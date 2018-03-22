package com.liaoye.demo4;

import java.util.LinkedHashSet;

/*
 * LinkedHashSet:底层数据结构由哈希表和链表组成。
 * 哈希表保证元素的唯一性。
 * 链表保证元素有素。(存储和取出是一致)
 */

public class LinkedHashSetDemo {
    public static void main(String[] args){
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("hello");
        hashSet.add("java");
        hashSet.add("hello");
        hashSet.add("study");
        hashSet.add("world");
        hashSet.add("world");
        hashSet.add("hard");

        for (String s : hashSet) {
            System.out.println(s);
        }
    }
}
