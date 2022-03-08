package com.learn.day07;

/*
数组的复制、反转、查找（线性查找，二分查找）
arr2=arr1是虚假的复制，仅复制地址值
 */
public class CopySearch {
    public static void main(String[] args) {
        int[] arr1, arr2;
        arr1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        //复制arr1给arr2 这是将arr1的地址给到arr2 修改arr2 也会修改arr1 new一次有一个新的数组
//        arr2 = arr1;
//        //修改arr2中偶数索引元素，使其等于索引值
//        for (int i = 0; i < arr2.length; i++) {
//            if(i%2==0){
//                arr2[i]=i;
//            }
//            System.out.println(arr1[i]);// 修改arr2也会修改arr1
//        }
        //真正的复制
        arr2 = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            arr2[i] = arr1[i];
        }

        //数组的反转
//        for (int i = 0; i < arr2.length / 2; i++) {
//            int temp;
//            temp = arr2[i];
//            arr2[i] = arr2[arr2.length - 1 - i];
//            arr2[arr2.length - 1 - i] = temp;
//        }
        //方法2
        for (int i = 0, j = arr2.length - 1; i < j; i++, j--) {
            int temp = arr2[i];
            arr2[i] = arr2[j];
            arr2[j] = temp;
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }


        String[] arr3 = new String[]{"AA", "CC", "DD", "BB", "EE"};
        //线性查找
        String target = "BB";
        boolean isFlag = true;
        for (int i = 0; i < arr1.length; i++) {
            if (target.equals(arr3[i])) {  //String常用equals 是指内容相等
                System.out.println("找到了指定元素，索引为" + i);
                isFlag = false;
                break;
            }
        }
        if (isFlag) {
            System.out.println("没有找到");
        }

        //二分查找：效率高
        //前提是有序数组
        int[] arr4 = new int[]{-5, -2, 0, 7, 9, 13, 19};
        int target2 = 13;
        int head = 0;//首索引
        int end = arr4.length - 1;//末索引值

        while (head <= end) {
            int middle = (head + end) / 2;//取左边的值
            if(target2==arr4[middle]){
                System.out.println("找到了指定元素，索引为" + middle);
                break;
            } else if (target2 > arr4[middle]) {
                head = middle + 1;
            }else{
                end = middle - 1;
            }
        }
        if(head>=end){
            System.out.println("没有找到");
        }



    }
}
