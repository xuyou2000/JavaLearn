package com.learn.day09;

/*
自定义数组工具类

 */
public class ArrayUtil {

    //求数组最大值
    public int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    //求数组最小值
    public int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //求数组的总和
    public int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    //求数组平均数
    public int getAvg(int[] arr) {

        return getSum(arr)/arr.length ;
    }

    //反转数组
    public void reverse(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    //复制数组
    public int[] copy(int[] arr) {
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    //数组排序
    public void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { //总共length-1轮
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) { //最后是最大的 则大于交换 最后是最小的 则小于交换
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    //查找指定元素
    public int getIndex(int[] arr,int target) {
        int head = 0;//首索引
        int end = arr.length - 1;//末索引值
        while (head <= end) {
            int middle = (head + end) / 2;//取左边的值
            if(target==arr[middle]){
                return middle;
            } else if (target > arr[middle]) {
                head = middle + 1;
            }else{
                end = middle - 1;
            }
        }

        return -1;//返回-1，表示没有找到
    }

}
