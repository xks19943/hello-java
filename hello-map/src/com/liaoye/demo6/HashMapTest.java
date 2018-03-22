package com.liaoye.demo6;

/*
 * 为了更符合要求：
 * 		这次的数据就看成是学生对象。
 *
 * 传智播客
 * 		bj	北京校区
 * 			jc	基础班
 * 					林青霞		27
 * 					风清扬		30
 * 			jy	就业班
 * 					赵雅芝		28
 * 					武鑫		29
 * 		sh	上海校区
 * 			jc	基础班
 * 					郭美美		20
 * 					犀利哥		22
 * 			jy	就业班
 * 					罗玉凤		21
 * 					马征		23
 * 		gz	广州校区
 * 			jc	基础班
 * 					王力宏		30
 * 					李静磊		32
 * 			jy	就业班
 * 					郎朗		31
 * 					柳岩		33
 * 		xa	西安校区
 * 			jc	基础班
 * 					范冰冰		27
 * 					刘意		30
 * 			jy	就业班
 * 					李冰冰		28
 * 					张志豪		29
 */

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args){

        HashMap<String, HashMap<String,ArrayList<Student>>> hashMap = new HashMap<>();
        HashMap<String,ArrayList<Student>> bjClassMap = new HashMap<>();
        HashMap<String,ArrayList<Student>> shClassMap = new HashMap<>();
        HashMap<String,ArrayList<Student>> gzClassMap = new HashMap<>();
        HashMap<String,ArrayList<Student>> xaClassMap = new HashMap<>();

        ArrayList<Student> bjOneList = new ArrayList<>();
        bjOneList.add(new Student("林青霞",27));
        bjOneList.add(new Student("风清扬",30));

        ArrayList<Student> bjTwoList = new ArrayList<>();
        bjTwoList.add(new Student("赵雅芝",28));
        bjTwoList.add(new Student("武鑫",29));


        ArrayList<Student> shOneList = new ArrayList<>();
        shOneList.add(new Student("郭美美",20));
        shOneList.add(new Student("犀利哥",22));

        ArrayList<Student> shTwoList = new ArrayList<>();
        shTwoList.add(new Student("罗玉凤",21));
        shTwoList.add(new Student("马征",23));


        ArrayList<Student> gzOneList = new ArrayList<>();
        gzOneList.add(new Student("王力宏",30));
        gzOneList.add(new Student("李静磊",32));

        ArrayList<Student> gzTwoList = new ArrayList<>();
        gzTwoList.add(new Student("郎朗",31));
        gzTwoList.add(new Student("柳岩",33));

        ArrayList<Student> xaOneList = new ArrayList<>();
        xaOneList.add(new Student("范冰冰",27));
        xaOneList.add(new Student("刘意",30));

        ArrayList<Student> xaTwoList = new ArrayList<>();
        xaTwoList.add(new Student("李冰冰",28));
        xaTwoList.add(new Student("张志豪",29));

        bjClassMap.put("基础班",bjOneList);
        bjClassMap.put("就业班",bjTwoList);
        shClassMap.put("基础班",shOneList);
        shClassMap.put("就业班",shTwoList);
        gzClassMap.put("基础班",gzOneList);
        gzClassMap.put("就业班",gzTwoList);
        xaClassMap.put("基础班",xaOneList);
        xaClassMap.put("就业班",xaTwoList);

        hashMap.put("北京校区",bjClassMap);
        hashMap.put("上海校区",shClassMap);
        hashMap.put("广州校区",gzClassMap);
        hashMap.put("西安校区",xaClassMap);

        for (String schoolName : hashMap.keySet()) {
            System.out.println(schoolName);
            HashMap<String, ArrayList<Student>> classMap = hashMap.get(schoolName);
            for (String className : classMap.keySet()) {
                System.out.println(className);
                ArrayList<Student> studentList = classMap.get(className);
                for (Student student : studentList) {
                    System.out.println(student.getName() + "---" + student.getAge());
                }
            }
        }

    }
}
