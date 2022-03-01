package com.learn.day02;
/*
命名规则：
1. 避开关键字
2. 字母 数字 _ $ 四种

命名规范：
包名（package）：多单词组成所有字母小写 xxxyyyyzzzz
类（class）名、接口名：多单词组成，首字母大写 XxxYyyZzzz
变量名、方法名： 第一个首字母小写 后面首字母大写 xxxYyyZzzz
常量名：所有字母大写 多单词用_分割 XXX_YYY_ZZZZ

可以使用中文命名 但不建议
 */
public class Identifier {
    public static void main(String[] args) {
        int myNumber = 1001;
        int 学号 = 1003; //不建议
        System.out.println(myNumber);
        System.out.println(学号);

    }
}

