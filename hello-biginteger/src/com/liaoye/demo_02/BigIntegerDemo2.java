package com.liaoye.demo_02;

import java.math.BigInteger;

/*
 * public BigInteger add(BigInteger val):加
 * public BigInteger subtract(BigInteger val):减
 * public BigInteger multiply(BigInteger val):乘
 * public BigInteger divide(BigInteger val):除
 * public BigInteger[] divideAndRemainder(BigInteger val):返回商和余数的数组
 */


public class BigIntegerDemo2 {
    public static void main(String[] args){
        BigInteger bi1 = new BigInteger("20");
        BigInteger bi2 = new BigInteger("30");

        BigInteger bi3 = bi1.add(bi2);
        System.out.println("bi3 的值为：" + bi3);

        BigInteger bi4 = new BigInteger("5");
        BigInteger bi5 = bi3.subtract(bi4);
        System.out.println("bi5 的值为：" + bi5);

        BigInteger bi6 = new BigInteger("2");
        BigInteger bi7 = bi5.multiply(bi6);
        System.out.println("bi7 的值为：" + bi7);

        BigInteger bi8 = new BigInteger("3");
        BigInteger bi9 = bi7.divide(bi8);
        System.out.println("bi9 的值为：" + bi9);


        BigInteger bi10 = new BigInteger("2");
        BigInteger[] biArray = bi1.divideAndRemainder(bi10);
        System.out.println(biArray[0] + " : " + biArray[1]);


    }
}
