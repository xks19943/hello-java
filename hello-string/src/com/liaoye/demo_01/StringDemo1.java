package com.liaoye.demo_01;

/**
 * 字符串：就是由多个字符组成的一串数据。也可以看成是一个字符数组。
 * 通过查看API，我们可以知道
 *  	A:字符串字面值"abc"也可以看成是一个字符串对象。
 * 	    B:字符串是常量，一旦被赋值，就不能被改变。
 * 	    不能改变是指值不能改变 不是引用不能改变。
 */
public class StringDemo1 {
    public static void main(String[] args){
        // public String():空构造
        String s1 = new String();
        System.out.println("s1:" + s1);
        System.out.println("s1.length():" + s1.length());
        System.out.println("--------------------------");

        // public String(byte[] bytes):把字节数组转成字符串
        byte[] bys = { 97, 98, 99, 100, 101 };
        String s2 = new String(bys);
        System.out.println("s2:" + s2);
        System.out.println("s2.length():" + s2.length());
        System.out.println("--------------------------");

        //从第一个索引为1到索引为3的字节数组的值转换为字符串
        String s3 = new String(bys, 1, 3);
        System.out.println("s3:" + s3);
        System.out.println("s3.length():" + s3.length());
        System.out.println("--------------------------");


        // public String(char[] value):把字符数组转成字符串
        char[] chs = { 'a', 'b', 'c', 'd', 'e', '爱', '林', '亲' };
        String s4 = new String(chs);
        System.out.println("s4:" + s4);
        System.out.println("s4.length():" + s4.length());
        System.out.println("--------------------------");

        // public String(char[] value,int index,int count):把字符数组的一部分转成字符串
        String s5 = new String(chs, 2, 4);
        System.out.println("s5:" + s5);
        System.out.println("s5.length():" + s5.length());
        System.out.println("--------------------------");



        //public String(String original):把字符串常量值转成字符串
        String s6 = new String("abcde");
        System.out.println("s6:" + s6);
        System.out.println("s6.length():" + s6.length());
        System.out.println("--------------------------");


        //字符串字面值"abc"也可以看成是一个字符串对象。
        String s7 = "abcde";
        System.out.println("s7:"+s7);
        System.out.println("s7.length():"+s7.length());


    }
}
