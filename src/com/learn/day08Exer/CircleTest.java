package com.learn.day08Exer;


/*
设计类Circle计算圆的面积
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 12;
        double area = circle.calculateArea();
        System.out.println("半径是"+circle.radius+"的圆的面积是：" + area);
    }
}

class Circle {
    double radius;
    //求圆的面积
    public double calculateArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
