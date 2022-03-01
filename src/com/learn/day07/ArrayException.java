package com.learn.day07;
/*
数组常见异常：
1.数组角标越界的异常：ArrayIndexOutOfBoundsException
2.空指针异常：NullPointerException
 */
public class ArrayException {
    public static void main(String[] args) {
        //空指针异常：
        //情况一：
//        int[] arr = new int[]{1, 2, 3, 4};
//        arr = null;
//        System.out.println(arr[0]);

        //情况二：
//        int[][] arr = new int[4][]; //外部数组每个元素为null
//        System.out.println(arr[0][0]);

        //情况三：对象是null
//        String[] arr = new String[]{null, "AA", "BB"};
//        System.out.println(arr[0].toString());

    }
}
