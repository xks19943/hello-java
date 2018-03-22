package com.liaoye.demo2;

/*
 * HashMap:是基于哈希表的Map接口实现。
 * 哈希表的作用是用来保证键的唯一性的。
 *
 * HashMap<String,String>
 * 键：String
 * 值：String
 */

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {
    public static void main(String[] args){
        // 创建集合对象
        HashMap<String, String> hm = new HashMap<String, String>();


        hm.put("it001", "马云");
        hm.put("it003", "马化腾");
        hm.put("it004", "乔布斯");
        hm.put("it005", "张朝阳");
        hm.put("it002", "裘伯君"); // wps
        hm.put("it001", "比尔盖茨");

        // 遍历
        Set<String> set = hm.keySet();
        for (String key : set) {
            String value = hm.get(key);
            System.out.println(key + "---" + value);
        }
    }
}
