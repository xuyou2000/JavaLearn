package com.learn.day04;

import java.util.Scanner;

/*
练习：
产生一个两位随机数，用户输入一个两位数判断用户是否能匹配（彩票问题）
[a,b]  Math.random()*(b - a + 1) + a
 */
public class RandomNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String userNum = sc.next();
        String luckyNum = (int) (Math.random() * 90 + 10) + ""; //random范围[0,1) [0,1)*90+10=[10,100) 最小为10
        //String luckyNum = "78";
        System.out.println("中奖号码为：" + luckyNum);
        if (userNum.equals(luckyNum)) {   //java中String常用equals而不用==  ==指向对象和地址是否相同 常用于基本数据类型
            System.out.println("奖金10000美元");
        } else if (userNum.charAt(0) == luckyNum.charAt(1) && userNum.charAt(1) == luckyNum.charAt(0)) {
            System.out.println("奖金3000美元");
        } else if (userNum.charAt(0) == luckyNum.charAt(0) || userNum.charAt(1) == luckyNum.charAt(1)) {
            System.out.println("奖金1000美元");
        } else if (userNum.charAt(0) == luckyNum.charAt(1) || userNum.charAt(1) == luckyNum.charAt(0)){
            System.out.println("奖金500美元");
        }else {
            System.out.println("彩票作废");
        }


    }
}
