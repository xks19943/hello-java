package com.liaoye.demo5;

import java.util.HashMap;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args){
        HashMap<String, HashMap<String,String>> storyMap = new HashMap<>();
        HashMap<String, String> oneMap = new HashMap<>();
        oneMap.put("古墓派","杨过");
        oneMap.put("桃花岛","郭芙");
        HashMap<String, String> twoMap = new HashMap<>();
        twoMap.put("江南派","郭靖");
        twoMap.put("桃花岛","黄蓉");

        storyMap.put("神雕侠侣",oneMap);
        storyMap.put("射雕英雄传",twoMap);

        Set<String> storyKeySet = storyMap.keySet();
        for (String  story : storyKeySet) {
            HashMap<String, String> map = storyMap.get(story);
            for (String nameKey : map.keySet()) {
                String name = map.get(nameKey);
                System.out.println(story + ":" + nameKey + "---" +name);
            }
        }
    }
}
