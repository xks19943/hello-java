package com.liaoye.demo4;

import java.util.ArrayList;

/*只用一个list实现去重*/
public class ArrayListDemo2 {
    public static void main(String[] args){
        ArrayList array = new ArrayList();

        // 添加多个字符串元素(包含内容相同的)
        array.add("hello");
        array.add("world");
        array.add("java");
        array.add("world");
        array.add("java");
        array.add("world");
        array.add("world");
        array.add("world");
        array.add("world");
        array.add("java");
        array.add("world");

        // 由选择排序思想引入，我们就可以通过这种思想做这个题目
        // 拿0索引的依次和后面的比较，有就把后的干掉
        // 同理，拿1索引...

        for (int i = 0; i < array.size(); i++) {
            for (int j = i + 1; j < array.size(); j++) {
                if(array.get(i).equals(array.get(j))){
                    array.remove(j);
                    j--;
                }
            }
        }

        System.out.println(array);
    }
}
