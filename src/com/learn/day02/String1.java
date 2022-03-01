package com.learn.day02;

/*
String属于引用数据类型，不属于基本数据类型，可以用""表示
String和其他基本数据类型做运算只能是连接运算（+）结果为String类型
强制转换成String 可以用num+""
 */
public class String1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        System.out.println(s1);
        //string可以不写 char必须要有内容
        //char c1 = '';编译不通过

        //**************************
        int number = 1001;
        String numberStr = "学号是：";
        System.out.println((numberStr + number));

        //**************************
        //练习1
        char c = 'a';
        int num = 10;
        String str = "hello";
        System.out.println(c + num + str);//107hello
        System.out.println(c + str + num);//ahello10
        System.out.println(c + (num + str));//a10hello
        System.out.println(str + num + c);//hello10a

        //练习2
        //输出: *   *
        System.out.println("*\t*");//*   *
        System.out.println('*' + '\t' + '*'); //都是单引号 不为String类型 结果为93
        System.out.println('*' + "\t" + '*');//*	*
        System.out.println('*' + '\t' + "*");//先运算单引号 结果为51*
        System.out.println('*' + ('\t' + "*"));//*	 *

        //str转换为int
        String str1 = "123";
        //int num = (int) str1;//编译不通过
        int num1 = Integer.parseInt(str1);
        System.out.println(num1);
        //int强制转换成String 可以用num+""
        int num2 = 1;
        System.out.println(num2+"");

    }
}
