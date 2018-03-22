package com.liaoye.demo2;

public class ObjectToolDemo {
    public static void main(String[] args){
        ObjectTool objectTool = new ObjectTool();
        objectTool.setObj("Hello");
        String s = (String) objectTool.getObj();
        System.out.println(s);

        ObjectTool objectTool1 = new ObjectTool();
        objectTool1.setObj(12);
        Integer i = (Integer) objectTool1.getObj();
        System.out.println(i + "---");
    }
}
