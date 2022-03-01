package com.learn.day05;

import java.util.Scanner;

/*
初始化条件
while(循环条件){
    循环体
    迭代条件
}
 */
public class WhileTest {
    public static void main(String[] args) {

    }
}

/*
do while循环结构
初始化条件
do{
    循环体
    迭代条件
}while(循环条件)
do-while循环会先执行一次循环体 先执行循环体后判断

 */
class DoWhileTest {
    public static void main(String[] args) {

    }
}

/*
从键盘读取不确定个整数，并判断读入的正数和负数的个数，输入为0时结束程序
while(true)和for(;;)都能表示无限循环
 */
class WhileExe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入整数：（以0结束）");
        int moreThan0 = 0, lessThan0 = 0;
        while (true) {
            int inputNum = scan.nextInt();
            if (inputNum > 0) {
                moreThan0++;
            } else if (inputNum < 0) {
                lessThan0++;
            }else{
                break;
            }
        }
        System.out.println("正数有" + moreThan0+"个");
        System.out.println("负数有" + lessThan0 + "个");
        System.out.println("总共有" + (moreThan0+lessThan0) + "个");

    }
}
/*
练习：求1000以内的所有完数 完数本身等于各因子之和 6=1+2+3
 */
class WanShu {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            int sumFactor = 0;
            for (int j = 1; j <= i/2 ; j++) {
                    if (i % j == 0) {
                        sumFactor += j;
                    }
            }
            if (sumFactor==i)
                System.out.println(i);
        }
    }
}
