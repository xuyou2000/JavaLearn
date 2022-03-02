package com.learn.day08Exer;

public class Exer3Test {
    public static void main(String[] args) {
        Exer3Test test = new Exer3Test();
//        int area=test.method(12,5);
        System.out.println("面积是" + test.method(12,5));
    }

    public int method(int m,int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        return m * n;
    }
}
