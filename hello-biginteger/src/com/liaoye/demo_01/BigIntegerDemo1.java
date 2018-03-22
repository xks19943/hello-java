package com.liaoye.demo_01;

import java.math.BigInteger;

public class BigIntegerDemo1 {
    public static void main(String[] args){
        Integer integer = new Integer(Integer.MAX_VALUE);
        System.out.println("integer 的最大值为：" + integer);

        /*java.lang.NumberFormatException: For input string: "2147483648"*/
        /*Integer i = new Integer("2147483648");
        System.out.println("i 的值为：" + i);*/

        BigInteger bigInteger = new BigInteger("2147483648");
        System.out.println("bigInteger 的值为：" + bigInteger);
    }
}
