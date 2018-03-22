package com.liaoye.demo5;

/*使用LinkedList模拟堆栈后进先出的问题*/
public class MyStackDemo {
    public static void main(String[] args){
        MyStack stack = new MyStack();
        stack.add("嘻嘻");
        stack.add("哈哈");


        while (!stack.isEmpty()){
            System.out.println(stack.get());
        }
    }
}
