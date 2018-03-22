package com.liaoye.demo3;

/*
 * 可变参数：定义方法的时候不知道该定义多少个参数
 * 格式：
 * 		修饰符 返回值类型 方法名(数据类型…  变量名){
 *
 * 		}
 *
 * 		注意：
 * 			这里的变量其实是一个数组
 * 			如果一个方法有可变参数，并且有多个参数，那么，可变参数肯定是最后一个
 */

public class ArgsDemo {
    public static void main(String[] args){
        // 2个数据求和
        int a = 10;
        int b = 20;
        int result = sum(a, b);
        System.out.println("result:" + result);

        // 3个数据的求和
        int c = 30;
        result = sum(a, b, c);
        System.out.println("result:" + result);

        // 4个数据的求和
        int d = 30;
        result = sum(a, b, c, d);
        System.out.println("result:" + result);
    }



     /*public static int sum(int a, int b, int c, int d) {
     return a + b + c + d;
     }

     public static int sum(int a, int b, int c) {
     return a + b + c;
     }

     public static int sum(int a, int b) {
     return a + b;
     }*/

     public static int sum(int... a){
        int s = 0;
         for (int i: a) {
             s += i;
         }
         return s;
     }
}
