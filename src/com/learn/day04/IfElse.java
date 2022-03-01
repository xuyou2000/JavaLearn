package com.learn.day04;
/*
if(条件表达式){
}
else if(条件表达式){
}
else{
}
注：
java中 if-else可以不使用缩进和{}，但一般建议缩进和使用{}
不使用括号时指接下一行的内容是判断内容，与缩进无关
else如果没有括号 遵守就近原则

 */
public class IfElse {
    public static void main(String[] args) {
        //可以不使用{}
        if(false)
        System.out.println("good");
        else if(true) System.out.println("notgood");

        int x = 4;
        int y = 1;
        if(x>2){
            if(y>2)
                System.out.println(x + y);
                System.out.println("good");//输出结果为good 这条语句不受到y>2判断条件影响
            }
        else
            System.out.println(x);

    }
}
