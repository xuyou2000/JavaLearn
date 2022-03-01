package com.learn.day07;

import java.util.Scanner;

/*
算法考查：求元素中最大值、最小值、平均数、总和等；
随机生成两位数，然后分别求出上述值
 */
public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("请输入随机生成个数：");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 90 + 10);
            System.out.println(arr[i]);
        }
        int sum = 0, min = arr[0], max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
            sum += arr[i];
        }
        double average = sum / num;
        System.out.println("最大值是" + max);
        System.out.println("最小值是" + min);
        System.out.println("总和是" + sum);
        System.out.println("平均值是" + average);

    }
}
