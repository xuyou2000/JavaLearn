package com.learn.day09;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int arr[] = new int[]{32, 45, 33, 67, 88, 33, 85, 12, 2};
        int max = util.getMax(arr);
        System.out.println("最大值是:" + max);

    }
}
