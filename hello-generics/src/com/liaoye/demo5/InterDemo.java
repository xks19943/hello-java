package com.liaoye.demo5;

public class InterDemo {
    public static void main(String[] args){
        InterImpl<String> inter = new InterImpl<>();
        inter.show("嘻嘻哈哈");
        InterImpl<Integer> inter1 = new InterImpl<>();
        inter1.show(12);
    }
}
