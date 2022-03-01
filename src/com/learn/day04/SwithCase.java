package com.learn.day04;

import java.util.Scanner;

/*
分支结构二： switch-case

1.格式
switch(表达式){
case 常量1:
    执行语句1;
    break;

    ...
default: //类似于else
    执行语句n;

如果没有break 则继续向下执行后续内容 直到第一个break
表达式常用类型：byte/short/int/char/枚举类型/String(没有浮点和boolean类型)

switch-case可以执行语句相同可以合并
case 常量1:
case 常量2:
case 常量3:
case 常量4:
    执行语句1;
    break;

 */
public class SwithCase {
    public static void main(String[] args) {
        int num = 2;
        switch (num) {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;//如果没有break 则继续向下执行后续内容
            case 3:
                System.out.println("3");
                break;
            default:
                System.out.println("others");
        }
    }
}

/*
使用switch-case 输入年月和日 判断闰年并计算是第几天
注：可以通过不使用break来计算

闰年：
1.可以被4整除但不可以被100整除
2.可以被400整除
 */
class SwithCaseTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scan.nextInt();
        System.out.println("请输入月份：");
        int month = scan.nextInt();
        System.out.println("请输入日期：");
        int day = scan.nextInt();
        int totalDay = 0;
        switch (month - 1) {
            case 11:
                totalDay += 30;
            case 10:
                totalDay += 31;
            case 9:
                totalDay += 30;
            case 8:
                totalDay += 31;
            case 7:
                totalDay += 31;
            case 6:
                totalDay += 30;
            case 5:
                totalDay += 31;
            case 4:
                totalDay += 30;
            case 3:
                totalDay += 31;
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    totalDay += 29;
                } else {
                    totalDay += 28;
                }
            case 1:
                totalDay += 31;
            default:
                totalDay += day;

        }
        System.out.println("总共：" + totalDay + "天");
    }
}