package com.liaoye.demo8;

/*
 * 编写一个程序，获取10个1至20的随机数，要求随机数不能重复。
 *
 * 分析：
 * 		A:创建随机数对象
 * 		B:创建一个HashSet集合
 * 		C:判断集合的长度是不是小于10
 * 			是：就创建一个随机数添加
 * 			否：不搭理它
 * 		D:遍历HashSet集合
 */

import java.util.HashSet;
import java.util.Random;

public class HashSetDemo {
    public static void main(String[] args){
        HashSet<Integer> hashSet = new HashSet<>();

        while (hashSet.size() < 10){
            Random random = new Random();
            int i = random.nextInt(20) + 1;
            hashSet.add(i);
        }
        for (Integer i : hashSet) {
            System.out.println(i + "");
        }
    }
}
