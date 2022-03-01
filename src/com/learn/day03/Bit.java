package com.learn.day03;

/*
位运算符
>> << >>> & | ^ ~
结论：
1.操作都为int型数据，<<在一定范围内向左移一位 表示*2
2.右移 正数最高位拿0补，负数最高位拿1补 >>>无符号右移 都拿0补
3.异或^ m=（m^n)^n 相同为0
注：
int型32位 第一位表示正负 范围为-2^31~2^31-1
 */
public class Bit {
    public static void main(String[] args) {
        int i = 21;
        System.out.println("i << 2:" + (i << 2)); //左移2位 21*2的2次方
        System.out.println("i << 27:" + (i << 27)); //最高位为1 出现负数

        //练习：交换两个变量的值
        int num1 = 10;
        int num2 = 20;

        //方式一：
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println(num1);
        System.out.println(num2);

        //方式二：建议使用方式一 方式二可能溢出
        num1 = 10;
        num2 = 20;
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println(num1);
        System.out.println(num2);

        //方式三：异或 m=(m^n)^n
        num1 = 10;
        num2 = 20;
        num1 = num1 ^ num2;
        num2 = num1 ^ num2; //10
        num1 = num1 ^ num2; //20

    }
}
