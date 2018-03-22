package com.liaoye.demo_02;

/**
 * 学习使用选择排序
 * 从0索引开始，依次和后面元素比较，小的往前放，第一次完毕，最小值出现在了最小索引处
 */
public class ArrayDemo2 {
    public static void main(String[] args){
        int[] arr = { 24, 69, 80, 57, 13 };
        System.out.println("排序前：");
        printArray(arr);
        selectSort(arr);
        System.out.println("排序后：");
        printArray(arr);
    }

    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }


    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                System.out.print("[" + arr[i]);
            }else if(i == arr.length - 1){
                System.out.print("," + arr[i] + "]" + "\n");
            }else {
                System.out.print("," + arr[i]);
            }
        }
    }
}
