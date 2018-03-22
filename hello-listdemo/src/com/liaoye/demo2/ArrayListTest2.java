package com.liaoye.demo2;

import java.util.ArrayList;

/**
 * 获取10个1-20之间的随机数，要求不能重复
 */
public class ArrayListTest2 {
    public static void main(String[] args){
        ArrayList<Integer> numberList = new ArrayList<>();

        while (true){
            int number = (int) (Math.random() * 20 + 1);
            if(!numberList.contains(number)){
                numberList.add(number);
            }
            if(numberList.size() == 10){
                break;
            }
        }

        System.out.println(numberList);
    }
}
