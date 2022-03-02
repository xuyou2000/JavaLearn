package com.learn.day08;

import java.util.Arrays;

/*
类中方法的声明和使用

方法：描述类应该具有的功能
方法的声明：权限修饰符 返回值类型 方法名（形参列表）{

}
如果方法有返回值，则必须在方法声明时，指定返回值的类型。同时，方法中需要return关键字来返回指定类型的变量或常量。
void 通常不使用return，如果使用的话，直接写"return;"类似于break
方法名：要符合方法名规范xxxYyyyZzzz 见名知意

注意： static、final、abstract来修饰的方法，后面再讲
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer cust1 = new Customer();
        cust1.age = 10;
        cust1.eat();
        cust1.sleep(2);
        cust1.age = 0;

        int[] arr = new int[]{13, 7, 4, 8};
        cust1.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

class Customer {
    //属性
    String name;
    int age;
    boolean isMale;

    //方法
    public void eat() {
        if(age>18)
            return;
        System.out.println("客户吃饭");
    }

    public void sleep(int hour) {
        System.out.println("休息了" + hour + "小时");
    }

    public String getName() {
        return name;
    }

    public String getNation(String nation) {
        String info = "我的国籍是" + nation;
        return info;
    }

    public void sort(int[] arr) {
        Arrays.sort(arr);

    }
}

