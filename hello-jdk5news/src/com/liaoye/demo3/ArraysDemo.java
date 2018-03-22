package com.liaoye.demo3;

import java.util.Arrays;
import java.util.List;

/*
 * public static <T> List<T> asList(T... a):把数组转成集合
 *
 * 注意事项：
 * 		虽然可以把数组转成集合，但是集合的长度不能改变。
 */
public class ArraysDemo {
    public static void main(String[] args){
        List<String> list = Arrays.asList("hello", "study", "hard");

        // java.lang.UnsupportedOperationException
        //list.add("java");

        for (String s: list) {
            System.out.println(s);
        }
    }
}
