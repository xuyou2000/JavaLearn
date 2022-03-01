package com.learn.day07;

import java.util.Scanner;

public class ArrayExe2 {
    public static void main(String[] args) {
        int[] x, y[];//x是一维数组，y是二维数组
        x = new int[]{1, 2, 3};
        y = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        //判断类型是否相同即可判断是否可以=
        //x[0]=y; //no
        y[0] = x;//yes
        //y[0][0] = x;//no
        //x[0][0] = y;//no
        y[0][0] = x[0];//yes
        //x = y;//no

        //练习：打印n行杨辉三角
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入杨辉三角行数：");
        int row = scan.nextInt();
        int[][] yanghui = new int[row][];
        for (int i = 0; i < yanghui.length; i++) {
            yanghui[i] = new int[i + 1];
            for (int j = 0; j < yanghui[i].length; j++) {
                if (j == 0 || j == i) {
                    yanghui[i][j] = 1;
                } else {
                    yanghui[i][j] = yanghui[i - 1][j - 1] + yanghui[i - 1][j];
                }
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }

        //练习2：创建一个长度为6的int数组，要求数组元素值在1-30之间，要求各不相同。
        //难点：各不相同
        int arr[] = new int[6];
        label:
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 30 + 1); //random为double型需要强制转为int
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    i--; //重新执行第i次外部循环，即重新生成arr[i]
                    continue label;//本次不输出 由于i-- 重新生成arr[i]
                }
            }
            System.out.println(arr[i]);
        }


    }
}

/*
回形数：
输入3 123
      894
      765
 */
class HuiXingShu {
    public static void main(String[] args) {
        System.out.println("请输入行数：");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int len = n * n;
        int[][] arr = new int[n][n];
        int directionFlag = 0;//判断方向，0为向右，1向下，2向右，3向上，依次循环
        int row = 0, col = 0;
        int rowMax = n, colMax = n;
        int rowMin = 0, colMin = 0;
        for (int i = 1; i <= len; i++) {
            if (directionFlag == 0) {
                if (col <= colMax - 1) {
                    arr[row][col] = i;
                    col++;
                } else {
                    directionFlag = 1;
                    row++;
                    col--;
                    colMax--;
                    i--;
                }
            } else if (directionFlag == 1) {
                if (row <= rowMax - 1) {
                    arr[row][col] = i;
                    row++;
                } else {
                    directionFlag = 2;
                    col--;
                    row--;
                    rowMax--;
                    i--;
                }
            } else if (directionFlag == 2) {
                if (col >= colMin) {
                    arr[row][col] = i;
                    //System.out.println("第" + row + "行" + col + "列=" + i);
                    col--;
                } else {
                    directionFlag = 3;
                    row--;
                    col++;
                    colMin++;
                    i--;
                }
            } else if (directionFlag == 3) {
                if (row >= rowMin + 1) {
                    arr[row][col] = i;
                    row--;
                } else {
                    directionFlag = 0;
                    col++;
                    row++;
                    rowMin++;
                    i--;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}