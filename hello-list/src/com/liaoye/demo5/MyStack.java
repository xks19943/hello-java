package com.liaoye.demo5;

import java.util.LinkedList;

public class MyStack {

    private LinkedList linkedList;

    MyStack(){
        linkedList = new LinkedList();
    }

    public void add(Object o){
        linkedList.addFirst(o);
    }

    public Object get(){
        return linkedList.removeFirst();
    }

    public boolean isEmpty(){
        return linkedList.isEmpty();
    }
}
