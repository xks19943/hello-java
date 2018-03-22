package com.liaoye.demo2;

/*
 * HashMap<Integer,String>
 * 键：Integer
 * 值：String
 */

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo2 {
    public static void main(String[] args){
        // 创建集合对象
        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(27, "林青霞");
        hm.put(30, "风清扬");
        hm.put(28, "刘意");
        hm.put(29, "林青霞");

        // 遍历
        Set<Integer> set = hm.keySet();
        for (Integer key : set) {
            String value = hm.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
