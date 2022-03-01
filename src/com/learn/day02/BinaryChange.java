package com.learn.day02;

/*
二进制 0b开头
十进制
八进制 0开头
十六进制 0x开头

println结果都为十进制
 */
public class BinaryChange {
    public static void main(String[] args) {
        int num1 = 0b110;
        int num2 = 0127;
        int num3 = 110;
        int num4 = 0x110;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
    }
}
