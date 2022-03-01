package com.learn.day04;

import java.util.Scanner;

/*
for循环结构 各个条件都可以是多个用,分割
for(初始化条件;循环条件;迭代条件){
    循环体
}
执行顺序：初始化条件 --> 循环体 --> 迭代条件
定义的i只在for循环内有效
 */
public class ForTest {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) { //i=0,1,2,3,4
            System.out.println("hello");
        }

        //练习1：多个迭代条件
        int num1 = 1;
        for (System.out.print('a');num1<=3; System.out.print('c'),num1++){
            System.out.print('b');
        }

        //遍历100以内的偶数
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }

        //练习2：遍历1~150 3的倍数 打印出foo 5的倍数打印biz 7的倍数打印baz
        String output;
        for (int i = 1; i <= 150; i++) {
            output = i + " ";
            if (i % 3 == 0) {
                output += "foo ";
            }
            if (i % 5 == 0) {
                output += "biz ";
            }
            if (i % 7 == 0) {
                output += "baz ";
            }
            System.out.println(output);
        }

    }
}

class ForTest2{
    public static void main(String[] args) {
        //练习3：输入两个正整数 求其最大公约数和最小公倍数 12和20最大公约数是4和最小公倍数是60
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = scan.nextInt();
        System.out.println("请输入第二个正整数：");
        int num2 = scan.nextInt();

        for (int i = Math.min(num1, num2); i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println("最大公约数是：" + i);
                break;
            }
        }
        for (int i = Math.max(num1,num2); i <= num1*num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println("最小公倍数是：" + i);
                break;
            }
        }
    }
}
