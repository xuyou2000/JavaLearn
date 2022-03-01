package com.learn.day05;

/*
嵌套循环的使用

 */
public class ForFor {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
九九乘法表
 */
class NineNineTable {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j + " ");
            }
            System.out.println();
        }
    }
}

/*
100以内所有质数的输出
 */
class PrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        long start = System.currentTimeMillis();
        for (int i = 2; i <= 10000; i++) {
            boolean isFlag = true;
            for (int j = 2; j <= Math.sqrt(i); j++) { //优化 将j的最大值有i改为sqrt(i)
                if (i%j==0){
                    isFlag = false;
                    break;
                }
            }
            if(isFlag)
                count++;
        }
        System.out.println("总共" + count + "个");
        long end=System.currentTimeMillis();
        System.out.println(end-start+"ms");
    }
}

/*
输出质数，优化(使用标签+continue)
 */
class PrimeNumber2{
    public static void main(String[] args) {
        int count = 0;
        long start = System.currentTimeMillis();
        label:
        for (int i = 2; i <= 10000; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++){
                if (i%j==0){
                    continue label; //跳过了count++步骤
                }
            }
            count++;
        }
        System.out.println("总共" + count + "个");
        long end=System.currentTimeMillis();
        System.out.println(end-start+"ms");
    }
}