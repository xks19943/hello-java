package com.liaoye.demo1;

/*
 * boolean addAll(Collection c):添加一个集合的元素
 * boolean removeAll(Collection c):移除一个集合的元素(是一个还是所有)
 * boolean containsAll(Collection c)：判断集合中是否包含指定的集合元素(是一个还是所有)
 * boolean retainAll(Collection c):两个集合都有的元素?思考元素去哪了，返回的boolean又是什么意思呢?
 */

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo2 {
    public static void main(String[] args){
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        c1.add("hello");
        c1.add("world");
        c2.add("嘻嘻");
        c2.add("哈哈");
        c1.addAll(c2);
        System.out.println(c1);

        /*只有包含集合里面的全部元素才叫包含*/
        //System.out.println(c1.containsAll(c2));


        c2.add("呼呼");

        /*只要有一个元素移除了就返回true*/
        //System.out.println(c1.removeAll(c2));

        //System.out.println(c1.containsAll(c2));

        //假设有两个集合A，B。
        //A对B做交集，最终的结果保存在A中，B不变。
        //返回值表示的是A是否发生过改变。


        /*System.out.println(c1.retainAll(c2));
        System.out.println(c1);

        System.out.println(c1.retainAll(c2));
        System.out.println(c1);*/

    }
}
