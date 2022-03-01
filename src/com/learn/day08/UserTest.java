package com.learn.day08;

/*
类中属性的使用：
属性（成员变量） vs 局部变量
1.相同点：
    定义变量格式一样，都要先声明后使用
    都有其对应的作用域

2.不同点：
    在类中声明的位置的不同
    属性：直接定义在{}内
    局部变量：声明在方法内、方法形参、代码块内、构造器形参、构造器内部的变量

    权限修饰符的不同（public、private、缺省、protected等）---> 类的封装性
    属性：可以在声明属性时，指明其权限，使用权限修饰符
    局部变量：不可用修饰符

    默认初始化值
    属性：根据类型，都有默认初始化值
    局部变量：没有默认初始化值，调用之前一定要赋值。

    在内存中加载的位置不同
    属性：加载到堆空间（非static）
    局部变量：加载到栈空间

 */
public class UserTest {
    public static void main(String[] args) {

    }
}

class User {
    //属性（成员变量）
    String name;
    int age;

    //language、food就是局部变量
    public void talk(String language) {
        String food = "pizza";
        System.out.println("我们使用" + language);
    }

}
