package com.liaoye.demo_04;

public class IntegerDemo4 {
    public static void main(String[] args) {
        // 定义了一个int类型的包装类类型变量i
        // Integer i = new Integer(100);
        Integer ii = 100;
        ii += 200;
        System.out.println("ii:" + ii);

        // 通过反编译后的代码
        // Integer ii = Integer.valueOf(100); //自动装箱
        // ii = Integer.valueOf(ii.intValue() + 200); //自动拆箱，再自动装箱
        // System.out.println((new StringBuilder("ii:")).append(ii).toString());

        Integer iii = null;
        // NullPointerException
        if (iii != null) {
            iii += 1000;
            System.out.println(iii);
        }
    }
}
