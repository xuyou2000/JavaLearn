package com.learn.day06;

import java.util.Scanner;

/*
从键盘读入学生成绩找出最高分，并输出显示学生成绩等级
成绩>=最高分-10 A
          -20 B
          -30 C
          其余 D
 */
public class ArrayExe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入学生人数：");
        int studentNum = scan.nextInt();
        int[] score=new int[studentNum];
        int maxScore = 0;
        System.out.println("请输入" + studentNum + "个学生成绩：");
        for (int i = 0; i < studentNum; i++) {
            score[i] = scan.nextInt();
            if(maxScore<score[i]){
                maxScore=score[i];
            }
        }
        System.out.println("最高分是：" + maxScore);
        for (int i = 0; i < studentNum; i++) {
            String grade;
            if(score[i]>=maxScore-10){
                grade = "A";
            }else if(score[i]>=maxScore-20){
                grade = "B";
            }else if(score[i]>=maxScore-30){
                grade = "C";
            }else{
                grade = "D";
            }
            System.out.println("Studet\t" + i + "\tScore is  " + score[i] + "\tGrade is\t" + grade);
        }

    }
}
