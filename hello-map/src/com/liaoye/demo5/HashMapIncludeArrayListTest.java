package com.liaoye.demo5;

import java.util.*;

/*
 *需求：
 *假设HashMap集合的元素是ArrayList。有3个。
 *每一个ArrayList集合的值是字符串。
 *元素我已经完成，请遍历。
 *结果：
 *		 三国演义
 *		 	吕布
 *		 	周瑜
 *		 笑傲江湖
 *		 	令狐冲
 *		 	林平之
 *		 神雕侠侣
 *		 	郭靖
 *		 	杨过
 */
public class HashMapIncludeArrayListTest {
    public static void main(String[] args){
        LinkedHashMap<String, ArrayList<String>> hashMap = new LinkedHashMap<>();
        ArrayList<String> sanGuoList = new ArrayList<>();
        sanGuoList.add("吕布");
        sanGuoList.add("周瑜");

        ArrayList<String> xiaoAoList = new ArrayList<>();
        xiaoAoList.add("令狐冲");
        xiaoAoList.add("林平之");

        ArrayList<String> shenDiaoList = new ArrayList<>();
        shenDiaoList.add("郭靖");
        shenDiaoList.add("杨过");

        hashMap.put("三国演义",sanGuoList);
        hashMap.put("笑傲江湖",xiaoAoList);
        hashMap.put("神雕侠侣",shenDiaoList);

        Set<Map.Entry<String, ArrayList<String>>> entrySet = hashMap.entrySet();
        for (Map.Entry<String, ArrayList<String>> entry : entrySet) {
            String entryKey = entry.getKey();
            System.out.println(entryKey);
            ArrayList<String> entryList = entry.getValue();
            for (String s : entryList) {
                System.out.println(s);
            }
        }
    }
}
