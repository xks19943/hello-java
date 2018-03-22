package com.liaoye.demo_06;

/**
 * 统计 woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun 中java出现的次数
 */
public class StringDemo6 {
    public static void main(String[] args){
        String content = "woaijavawozhenaijavawozhendeaijavawozhendehenaijavaxinbuxinwoaijavagun";
        String val = "java";
        int count = 0;
        int index = content.indexOf(val);

        while (index != -1){
            /*修改大串的值*/
            content = content.substring(index + val.length());
            count = count + 1;
            index = content.indexOf(val);
        }
        System.out.println(val + " 出现的次数为：" + count);
    }
}
