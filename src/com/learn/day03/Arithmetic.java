package com.learn.day03;

/*
运算符
1.算数运算符
+ - * / % i++ ++i i-- --i 自增和自减运算级最高（除括号以外）
注：i++和i--先取值后运算
   ++i和--i 先运算后取值

 */
public class Arithmetic {
    public static void main(String[] args) {
        // 除号 /
        int num1 = 12;
        int num2 = 5;
        int result1 = num1 / num2;//2
        int result2 = num1 / num2 * num2;//10
        double result3 = num1 / num2; //2.0
        double result4 = (double) num1 / (double) num2;//2.4
        double result5 = (num1 + 0.0) / num2; //2.4  0.0代表double类型
        System.out.println(result5);

        //取余 % 结果符号与被模数(m1)符号相同
        int m1 = -12;
        int m2 = 5;
        System.out.println(m1 % m2);

        //i++ ++i
        //i++先取值后运算 ++i先运算后取值
        int a1 = 10;
        int b2 = a1++; //运算完后b2=10,a1=11
        int b3 = ++a1; //运算完后b3=12,a1=12
        System.out.println("b2 = "+b2+"，b3 = "+b3); //b2 = 10，b3 = 12

        //注意点  自增不会改变自身类型
        short s1 = 10;
//        s1 = s1 + 1; //编译不通过s1运算后要为int型
        s1++; //s1++不会改变自身类型
    }
}
