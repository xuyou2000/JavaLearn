package com.learn.day08Exer;

public class Person {
    String name;
    int age;
    int sex;

    public void study() {
        System.out.println("studying");
    }

    public void showAge() {
        System.out.println("年龄是" + age + "岁");
    }

    public int addAge(int i) {
        age += i;
        return age;
    }
}
