package com.liaoye.demo1;

/*
 * 获取功能：
 * V get(Object key):根据键获取值
 * Set<K> keySet():获取集合中所有键的集合
 * Collection<V> values():获取集合中所有值的集合
 */

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<>();

        // 创建元素并添加元素
        map.put("邓超", "孙俪");
        map.put("黄晓明", "杨颖");
        map.put("周杰伦", "蔡依林");
        map.put("刘恺威", "杨幂");


        // V get(Object key):根据键获取值
        System.out.println("get:" + map.get("周杰伦"));
        System.out.println("get:" + map.get("周杰")); // 返回null
        System.out.println("----------------------");

        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.println(s);
        }

        System.out.println("----------------------");
        Collection<String> values = map.values();
        for (String s : values) {
            System.out.println(s);
        }
    }
}
