package com.learn.day08;
/*
设计类的核心：设计类的成员
属性：对应类中的成员变量
行为：对应类中的成员方法（函数、method）

创建类的对象：类的实例化
如果创建了一个类的多个对象，则每个对象都独立的拥有一套类的属性（非static的属性）
内存解析：堆 存放对象实例 局部变量在栈空间
 */
public class PersonTest {
    public static void main(String[] args) {
        //创建Person类的对象
        Person p1 = new Person();
        //调用对象的结构：属性
        p1.name = "Tom";
        p1.isMale = true;
        p1.language = "中文";
        //调用方法
        p1.talk(p1.language);
        //********************
        Person p2 = p1; //=是赋值操作， 等同于数组的赋值 赋地址
        System.out.println(p2.name); //Tom 修改p2同时会修改p1

    }
}

class Person {
    //属性
    String name;
    int age=0;
    boolean isMale;
    String language;

    //方法
    public void eat() {
        System.out.println("人可以吃");
    }
    public void talk(String language) {
        System.out.println(name+"可以说" + language);
    }
}
