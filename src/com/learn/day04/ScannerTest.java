package com.learn.day04;

import java.util.Scanner;

/*
如何从键盘获取不同类型的变量：需要使用Scanner类
具体实现步骤：
1.导包 import java.util.Scanner;
2.Scanner实例化 Scanner scan = new Scanner(System.in);
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //System.in 表示从键盘输入
        System.out.println("请输入你的姓名：");
        String name = scan.next();
        System.out.println(name);
        System.out.println("请输入你的年龄：");
        int num = scan.nextInt();//阅读api文档 获取int类型
        System.out.println(num);
        System.out.println("请输入你的性别：（男性为true,女性为false）");
        boolean sex = scan.nextBoolean();
        if (sex)
            System.out.println("男性");
        else
            System.out.println("女性");

    }
}

class IfTest {
    public static void main(String[] args) {
        //练习：获取岳小鹏的成绩并加以判断
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("请输入岳小鹏的成绩：");
            int grade = scan.nextInt();
            if (grade == 100)
                System.out.println("奖励一辆BMW");
            else if (grade > 80 && grade <= 99)//java中不能写 80<grade<=99
                System.out.println("奖励一台iPhone");
            else if (grade >= 60 && grade <= 80)
                System.out.println("奖励一台iPad");
            else if (grade==-1)
                break;
            else
                System.out.println("什么奖励都没有");
        }
    }
}

class IfTest2{
    public static void main(String[] args) {
        //输入三个数，对三个数进行排序
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入三个数：");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int temp;
        //冒泡排序
        if (num2<num1){
            temp = num1;
            num1 = num2;
            num2 = temp;
            if(num3<num2){
                temp = num2;
                num2 = num3;
                num3 = temp;
                if (num2<num1){
                    temp = num1;
                    num1 = num2;
                    num2 = temp;}
            }else {
                if (num2<num1){
                    temp = num1;
                    num1 = num2;
                    num2 = temp;}
            }
        } else{
            if(num3<num2){
                temp = num2;
                num2 = num3;
                num3 = temp;
                if (num2<num1){
                    temp = num1;
                    num1 = num2;
                    num2 = temp;}
            }else {
                if (num2<num1){
                    temp = num1;
                    num1 = num2;
                    num2 = temp;}
            }
        }
        System.out.println(num3+","+num2+","+num1);



    }
}
