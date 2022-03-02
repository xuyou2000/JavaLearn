package com.learn.day08Exer;

public class PersonTest {
    public static void main(String[] args) {
        Person p1 = new Person(); //public类可以在其他中被调用

        p1.name = "Tom";
        p1.age = 18;
        p1.sex = 1;

        p1.study();
        int newAge=p1.addAge(2);
        p1.showAge();
        System.out.println("newAge=" + newAge);
    }
}
