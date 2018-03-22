package com.liaoye.demo3;

import java.util.HashSet;

public class DogDemo {
    public static void main(String[] args){
        HashSet<Dog> hashSet = new HashSet<>();
        hashSet.add(new Dog("秦侩",22,"red","男"));
        hashSet.add(new Dog("秦侩",22,"red","男"));
        hashSet.add(new Dog("魏忠贤",21,"black","男"));
        hashSet.add(new Dog("秦侩",22,"red","男"));
        hashSet.add(new Dog("李莲英",20,"white","女"));

        for (Dog d : hashSet) {
            System.out.println(d.toString());
        }
    }
}
