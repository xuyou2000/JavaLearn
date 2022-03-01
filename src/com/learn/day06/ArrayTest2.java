package com.learn.day06;
/*
二维数组：
可以视为一维数组作为另一个数组的元素。

二维数组的使用
    1.二位数组的声明和初始化
    2.如何调用数组的指定位置的元素
    3.如何获取数组的长度
    4.如何遍历数组
    5.数组元素的默认初始化
    6.数组的内存解析
        类似一维数组 第一个堆中存放的是第二维数组的地址
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        //二维数组的初始化
        int[][] arr1 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8}};//前面的[]表示第几个小的{}，后面的表示{}第几个
        int[][] arr5 = {{1, 2, 3}, {4, 5}, {6, 7, 8}};//可以省略
        //动态初始化1
        String[][] arr2 = new String[3][2];
        //动态初始化2
        String[][] arr3 = new String[3][];//可以只赋值前一个 但不能只赋值后一个
        //其他初始化
        int[] arr4[] = new int[2][3];

        //调用由于arr3只定义了数组个数，需要再继续定义之后调用
        arr3[2] = new String[]{"a","b","c"};//或者arr3[2] = new String[3];
        //arr3[2] = new String[3];
        System.out.println(arr3[2][1]);
        //System.out.println(arr3[1][1]); //arr3[1]没有定义不能调用

        //数组长度:为前面那个数 即所包含的数组个数
        System.out.println(arr4.length);//2
        System.out.println(arr4[0].length);//3

        //遍历数组 嵌套循环
        for (int i = 0; i < arr1.length; i++) {
            for (int i1 = 0; i1 < arr1[i].length; i1++) {
                System.out.println(arr1[i][i1]);
            }
        }

        //默认值
        //int int[][] arr4 = new int[4][3];
        //外层元素：arr4[0] 默认为地址值
        //内层元素：arr[0][0] 同一维数组默认值

        //int int[][] arr4 = new int[4][];
        //外层元素：arr4[0] 默认为null
        //内层元素：arr[0][0] 不能调用

        //内存解析
        int[][] arr6 = new int[4][]; //栈中arr6存放地址 堆中数组各位为null
        arr6[1] = new int[]{1, 2, 3};//堆中arr6第二个存放arr6[1]的地址 堆中arr6[1]中存放1，2，3
        arr6[2] = new int[4];
        arr6[2][1] = 30;

    }
}
