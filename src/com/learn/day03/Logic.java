package com.learn.day03;

/*
逻辑运算符: 必须为boolean类型
&逻辑与 &&短路与 |逻辑或 ||短路或 !非 ^逻辑异或

逻辑与短路区别：
逻辑需要全部执行并判断
短路判断出第一个若为false/true 则停止 不执行后续内容

开发中推荐使用 && 和 ||
 */
public class Logic {
    public static void main(String[] args) {
        //区分 & 和 &&
        //相同点：运算的结果相同
        //不同点：当符号左边为false时，&继续执行符号右边的内容，&&不执行符号右边的内容
        boolean b1 = false;
        int num1 = 10;
        if (b1 & (num1++ > 0)) {
            System.out.println("good");
        }
        System.out.println(num1); //num1=11 b1和num1都要去执行和判断

        boolean b2 = false;
        int num2 = 10;
        if (b2 && (num2++ > 0)) {
            System.out.println("good");
        }
        System.out.println(num2); //num2=10 判断b2为false 直接输出false 不执行之后的的num2++

        //区分 | 和 ||
        //相同点：运算的结果相同
        //不同点：当符号左边为true时，|继续执行符号右边的内容，|不执行符号右边的内容
        boolean b3 = true;
        int num3 = 10;
        if (b3 | (num3++ > 0)) {
            System.out.println("good");
        }
        System.out.println(num3); //num3=11 b1和num1都要去执行和判断

        boolean b4 = true;
        int num4 = 10;
        if (b4 || (num4++ > 0)) {
            System.out.println("good");
        }
        System.out.println(num4); //num4=10 判断b2为true 直接输出true 不执行之后的的num4++


        //练习
        boolean y = false;
        if(y==true)if((y==true)&&(y=true)) y = true; //if((y==true)&&(y=true)) y = false; 为 y==true判断后的执行 该程序中不执行
        System.out.println(y);

    }
}
