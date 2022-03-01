package com.learn.day07;

import java.util.Arrays;

/*
十大排序：重要**

冒泡排序：
从前向后比较，两两比较
时间复杂度：O(n^2)

快速排序：
O(nlog(n))时间复杂度
路径：
/Users/xuyou/Desktop/尚硅谷Java课程资料/1_课件/第1部分：Java基础编程/
第1部分：Java基础编程/尚硅谷_宋红康_第3章_数组/sort/1-整型数组版—不考虑稳定性
 */
public class Rank {
    public static void main(String[] args) {

        int[] arr = new int[]{-1, -7, 0, 9, 8, 2, 2, 7, 6};

        //冒泡排序
        for (int i = 0; i < arr.length - 1; i++) { //总共length-1轮
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { //最后是最大的 则大于交换 最后是最小的 则小于交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

        //java工具 Arrays工具类

        //boolean equals(boolean[] a, boolean[] a2):比较两个数组是否相等
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{1, 3, 2, 4};
        boolean isEqual = Arrays.equals(arr1, arr2);
        System.out.println(isEqual);

        //String toString(int[] a):输出数组信息
        System.out.println(Arrays.toString(arr1));

        //void fill(int[] a, int val):将指定值val填充到数组中，替换所有元素
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));

        //void sort(int[] a):排序
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        //int binarySearch(int[] a, int key):二分查找
        int[] arr3 = new int[]{-5, -2, 0, 7, 9, 13, 19};
        int index = Arrays.binarySearch(arr3, 13); //返回负数则未找到
        System.out.println(index);


    }
}
