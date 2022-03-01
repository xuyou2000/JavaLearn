package com.learn.day02;

/*
基本数据类型之间的运算（7种之间的运算 不包含boolean）
1.自动类型转换
    容量小与容量大做运算时，结果自动提升为容量大的数据类型（指数的范围，不是所占内存空间）
    byte、short、char --> int --> long --> float --> double
    **byte、short、char相互之间在运算后，结果要为int以及更高级 包括同类相加（byte+byte也需要int）

2.强制类型转换：自动类型的逆运算
    需要使用强制转换符：()
    可能会有精度损失



 */
public class Variable2 {
    public static void main(String[] args) {
        byte b1 = 2;
        int i1 = 12;
        int i2 = b1 + i1; //不能用byte
        long l1 = b1 + i1;
        float f = b1 + i1; //会自动补.0  结果是14.0
        System.out.println(l1);
        System.out.println(f);

        //************  特别的情况  ****************
        char c1 = 'a'; //a运算中ascii表示97
        int i3 = 10;
        int i4 = c1 + i3;
        System.out.println(i4);

//        short s2 = 1;
//        byte b2 = 3;
//        short s3 = s2 + b2; //编译不通过
//        short s2 = b2 + b2;//编译不通过

        //强制类型转换
        double d1 = 12.5;
        //int i5 = d1;//编译不通过
        int i5 = (int) d1; //编译通过 结果为12 截断 不是四舍五入
        System.out.println(i5);

        int i6 = 128;
        byte b2 = (byte) i6;//结果为-128 超过-128~127的范围 从头开始
        System.out.println(b2);

    }
}

class Variable3 {
    public static void main(String[] args) {
        //特殊情况1
        //long 不加l视为int型 long比int容量大会自动类型提升
        long l = 1234;
        System.out.println(l);
        //float 不加f默认为double float比double容量小
        //会出现编译错误 必须要加F
        float f1 = 12.3F;

        //特殊情况2
        //整型常量默认为int型 1为int 1.2默认为double
        byte b = 12;
        //byte b1 = b + 1;//编译不通过
        byte b1 = (byte) (b + 1);
        int i1 = b + 1;

    }
}
