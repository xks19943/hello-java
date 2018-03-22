package com.liaoye.demo5;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * "aababcabcdabcde",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)
 */
public class TreeMapTest {
    public static void main(String[] args){
        String s = "aababcabcdabcde";
        char[] array = s.toCharArray();
        TreeMap<Character, Integer> treeMap = new TreeMap<>();

        for (char c : array) {
            int value = 1;
            if(treeMap.containsKey(c)){
                value = treeMap.get(c);
                value = value + 1;
            }
            treeMap.put(c,value);
        }

        Set<Map.Entry<Character, Integer>> entrySet = treeMap.entrySet();
        for (Map.Entry<Character, Integer> entry : entrySet) {
            System.out.print(entry.getKey() + "(" + entry.getValue() + ")");
        }
    }
}
