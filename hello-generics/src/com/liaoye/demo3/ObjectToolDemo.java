package com.liaoye.demo3;

public class ObjectToolDemo {
    public static void main(String[] args){
        ObjectTool<String> tool = new ObjectTool<>();
        tool.setObj("嘻嘻");

        System.out.println(tool.getObj());
    }
}
