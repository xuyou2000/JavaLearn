package com.learn.day03;
/*
赋值运算符
= += -= *= /= %=
不会改变数据类型

 */
public class SetValue {
    public static void main(String[] args) {
        //连续赋值
        int i1, j1;
        i1 = j1 = 10;

        int i2 = 10, j2 = 20;
        //********************
        int num1 = 12;
        num1 %= 5; //num=num % 5
        System.out.println(num1);

        short s1 = 10;
        //s1 = s1 + 2;//编译不通过 要用int型
        s1 += 2; //不会改变数据类型
        System.out.println(s1);

        //练习
        int i = 1;
        i *= 0.1;
        System.out.println(i);//i=0

        int n = 10;
        n += (n++) + (++n); //n = n + (n++) + (++n)  n=10+10+12=32
        System.out.println(n);
    }
}
