package com.liaoye.demo_01;

/**
 * 学习使用冒泡排序
 *      相邻元素两两比较，大的往后放，第一次完毕，最大值出现在了最大索引处
 * */
public class ArrayDemo1 {
    public static void main(String[] args){
        int[] arr = { 24, 69, 80, 57, 13 };
        System.out.println("排序前：");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("排序后：");
        printArray(arr);
    }

    private static void bubbleSort(int[] arr) {
        for (int x = 0; x < arr.length ; x++) {
            for (int y = 0; y < arr.length - x - 1; y++) {
                if(arr[y] > arr[y + 1]){
                    int temp = arr[y + 1];
                    arr[y + 1] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }


    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(i == 0){
                System.out.print("[" + arr[i]);
            }else if(i == arr.length - 1){
                System.out.print("," + arr[i] + "]");
            }else {
                System.out.print("," + arr[i]);
            }
        }
    }
}
