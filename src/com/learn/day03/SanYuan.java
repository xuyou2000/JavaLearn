package com.learn.day03;

/*
三元运算符：
（条件表达式）？ 表达式1：表达式2
说明：
条件表达式为Boolean类型 条件表达式为true 执行表达式1 false执行表达式2
表达式1和2要可以被统一为同一种类型（string和基本数据类型不能一起） 要求结果类型 要最大容量的

三元运算符可以转换为if-else，反过来不一定，但三元运算符运算效率高一些

 */
public class SanYuan {
    public static void main(String[] args) {
        //例：获取两个整数的较大值
        int m = 12;
        int n = 5;
        int max = (m > n) ? m : n;
        System.out.println(max);

        //三元运算符嵌套
        String maxStr = (m > n) ? "m大" : (m == n) ? "m和n相等" : "n大";
        System.out.println(maxStr);

        //练习2 获取三个数最大值
        int n1 = 12;
        int n2 = 30;
        int n3 = -43;
        int max2 = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        System.out.println(max2);

        //60 十六进制转换  3C
        //方法一：自动转换
        String str = Integer.toHexString(60);
        System.out.println(str);

        //方法二：手动转换
        int i1 = 60;
        int i2 = i1 & 15; //15的二进制为1111 取与运算 则仅保留后四位的二进制
        String str1 = (i2 > 9) ? (char) (i2 - 10 + 'A')+"": i2+"";
        int temp = i1 >>> 4;//右移 去掉最后四位
        i2 = temp & 15;//重复上述操作
        String str2 = (i2 > 9) ? (char) (i2 - 10 + 'A') + "" : i2 + "";
        System.out.println("" + str2 + str1);


    }
}
