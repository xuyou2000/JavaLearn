package com.learn.day08Exer;

import java.util.Scanner;

/*
定义类Student，包含三个属性:学号number(int)，年级state(int)，成绩 score(int)。 创建20个学生对象，学号为1到20，年级和成绩都由随机数确定。
问题一:打印出3年级(state值为3)的学生信息。
问题二:使用冒泡排序按学生成绩排序(升序)，并遍历所有学生信息
提示:
1) 生成随机数:Math.random()，返回值类型double;
2) 四舍五入取整:Math.round(double d)，返回值类型long。
 */
public class StudentTest {
    public static void main(String[] args) {
        //声明Student类型数组
        Student[] students = new Student[20];
        for (int i = 0; i < students.length; i++) {
            //***要给每一个students[i]new一个对象（数组元素实例化，类似于二维数组） 不然会报空指针异常
            students[i] = new Student();
            students[i].number = i+1;
            students[i].state = (int) (Math.random() * 6 + 1);
            students[i].score = (int) (Math.random() * 101);
        }

        Scanner scan = new Scanner(System.in);
        System.out.print("请输入选择年级：");
        int state = scan.nextInt();
        System.out.println(state + "年级成绩如下：");
        StudentTest test = new StudentTest();
        test.searchState(students,state);
        System.out.println("*********************************");

        students = test.studentRank(students);
        test.printAllInfo(students);


    }



    /**
     * @description 查找Students数组中指定年级学生信息
     * @Author XuYou
     * @Date 5:41 PM  2022/3/2
     * @param students 要查找的数组
     * @param state 要查找的年级
     * @return
     */
    public void searchState(Student[] students,int state) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == state) {
                System.out.println("学号是："+students[i].number+"，成绩是："+students[i].score);
            }
        }
    }
    
    /**
     * @description 根据score给students数组进行排序，并返回排序后的数组
     * @Author XuYou
     * @Date 5:55 PM  2022/3/2
     * @param students
     * @return {@link Student[]}
     */
    public Student[] studentRank(Student[] students) {
        for (int i = 0; i < students.length-1; i++) {
            for (int j = 0; j < students.length-1-i; j++) {
                if (students[j].score > students[j + 1].score) {
                    //直接交换Student对象即可 不用每一个参数都交换一遍
                    Student temp = new Student();
                    temp = students[j];
                    students[j]= students[j + 1];
                    students[j + 1]= temp;
                }
            }
        }
        return students;
    }

    public void printAllInfo(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            students[i].printInfo();
        }
    }
}

class Student {
    int number;//学号
    int state;//年级
    int score;//成绩

    public void printInfo() {
        System.out.println("学号是："+number+"，年级是："+state+"，成绩是："+score);
    }


}
