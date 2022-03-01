package com.learn.day06;
/*
数组：多个相同数据类型按一定顺序排列的集合。
数组名、元素、下标（索引）

数组本身是引用数据类型，其中元素可以是任何数据类型
数组长度一旦确定，不可更改
在内存空间中连续
分类：1.按维数：一维数组，二维数组，三维数组...(多维数组可以视为数组作为一个一维数组的元素，第一维类型为数组)
     2.按照元素的类型：基本数据类型元素的数组、引用数据类型元素的数组

一维数组的使用
    1.一位数组的声明和初始化
    2.如何调用数组的指定位置的元素
    3.如何获取数组的长度
    4.如何遍历数组
    5.数组元素的默认初始化
    6.数组的内存解析
        栈：存放局部变量
        堆：存放new出来的结构（对象、数组）
        方法区：常量池、静态域
 */
public class ArrayTest {
    public static void main(String[] args){
        //一维数组的声明和初始化
        int[] ids;
        //静态初始化：数组初始化和元素赋值操作同时进行
        ids = new int[]{1001, 1002, 1003, 1004};//引用数据类型初始化要用new 也可以合并
        int[] ids2 = {101, 102, 103}; //声明和初始化分开不能省略
        //动态初始化：数组初始化和元素赋值操作分开进行
        String[] names=new String[5]; //索引最多到4 小于5
        String names2[] = new String[5];

        //注：数组一旦初始化，其长度就确定了
        //通过索引调用 从0开始
        names[0] = "张三";
        names[1] = "李四";
        names[2] = "王五";
        names[3] = "王六";
        names[4] = "王七";

        //获取数组长度
        //使用length属性
        System.out.println(names.length);
       //遍历数组  name.fori
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        //数组元素的默认初始化值
        //int/short/byte/long 默认为0
        //boolean 默认为false  double/float默认为0.0 char 默认为 ascii码为数字0（不为'0'）
        //string默认为null
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //一维数组内存解析
        int[] arr1 = new int[]{1, 2, 3};//在栈空间添加一个局部变量arr1 在堆空间new出来一个数组，将首地址值赋给栈空间arr1 再赋值
        String[] arr2 = new String[4];//同上堆空间new一个 默认为null
        arr2[1] = "刘德华";//找到元素并赋值
        arr2[2] = "张学友";
        arr2 = new String[3]; //在堆空间new一个数组 并将新的首地址值赋给栈空间arr2 默认值都是null 原来的数组会被垃圾回收器清除
        System.out.println(arr2[1]); //值为null
        //main方法执行完 arr2、arr1按顺序出栈并被垃圾回收


    }
}
