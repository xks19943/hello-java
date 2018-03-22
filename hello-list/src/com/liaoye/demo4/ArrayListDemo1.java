package com.liaoye.demo4;

/*
 * ArrayList去除集合中字符串的重复值(字符串的内容相同)
 *
 * 分析：
 * 		A:创建集合对象
 * 		B:添加多个字符串元素(包含内容相同的)
 * 		C:创建新集合
 * 		D:遍历旧集合,获取得到每一个元素
 * 		E:拿这个元素到新集合去找，看有没有
 * 			有：不搭理它
 * 			没有：就添加到新集合
 * 		F:遍历新集合
 */

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args){
        ArrayList al = new ArrayList();

        al.add("xixi");
        al.add("haha");
        al.add("haha");
        al.add("huhu");

        ArrayList list = new ArrayList();

        for (int i = 0; i < al.size(); i++) {
            String s = (String) al.get(i);
            if(!list.contains(s)){
                list.add(s);
            }
        }

        System.out.println(list);
    }
}
