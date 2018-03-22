package com.liaoye.demo5;


/*
  ArrayList集合嵌套HashMap集合并遍历。
    需求：
        假设ArrayList集合的元素是HashMap。有3个。
        每一个HashMap集合的键和值都是字符串。
        元素我已经完成，请遍历。
    结果：
        周瑜---小乔
        吕布---貂蝉

        郭靖---黄蓉
        杨过---小龙女

        令狐冲---任盈盈
        林平之---岳灵珊
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class ArrayListIncludeHashMapTest {
    public static void main(String[] args){
        ArrayList<HashMap<String,String>> list = new ArrayList<>();

        HashMap<String, String> sanGuoMap = new HashMap<>();
        HashMap<String, String> sheDiaoMap = new HashMap<>();
        HashMap<String, String> xiaoAoMap = new HashMap<>();

        sanGuoMap.put("周瑜","小乔");
        sanGuoMap.put("吕布","貂蝉");

        sheDiaoMap.put("郭靖","黄蓉");
        sheDiaoMap.put("杨过","小龙女");

        xiaoAoMap.put("令狐冲","任盈盈");
        xiaoAoMap.put("林平之","岳灵珊");

        list.add(sanGuoMap);
        list.add(sheDiaoMap);
        list.add(xiaoAoMap);

        for (HashMap<String,String> map :list) {
            Set<String> keySet = map.keySet();
            for (String s : keySet) {
                System.out.println(s + "---" + map.get(s));
            }
        }
    }
}
