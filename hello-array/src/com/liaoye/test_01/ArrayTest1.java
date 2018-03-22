package com.liaoye.test_01;

/**
 * 分析：
 * 		A:定义一个字符串
 * 		B:把字符串转换为字符数组
 * 		C:把字符数组进行排序
 * 		D:把排序后的字符数组转成字符串
 * 		E:输出最后的字符串
 */
public class ArrayTest1 {
    public static void main(String[] args){
        //定义一个字符串
        String s = "dacgebf";

        char[] chs = s.toCharArray();

        bubbleSort(chs);

        String s1 = new String(chs);
        System.out.print("排序后的字符串为：" + s1);

    }

    private static void bubbleSort(char[] chs) {
        for (int i = 0; i < chs.length; i++) {
            for (int j = 0; j < chs.length - i - 1; j++) {
                if(chs[j] > chs[j + 1]){
                    char tmp = chs[j + 1];
                    chs[j + 1] = chs[j];
                    chs[j] = tmp;
                }
            }
        }
    }
}
