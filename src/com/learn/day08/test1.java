package com.learn.day08;
/*
假设一个数s=1000a+100b+10c+d
各位之和为s1=a+b+c+d
s-s1=999a+99b+9c
(s-s1)%9=0 ----->  s%9=s1%9
s1各位之和为s2
同理可得(s1-s2)%9=0 -----> s1%9=s2%9
以此类推 s%9=.....=sn%9 sn是倒数第二个数 sn%9是最后结果
但是sn%9=0时，结果应为9
 */
public class test1 {
    public int Solution(int s) {
        if (s % 9 != 0) {
            return s % 9;
        }else {
            return 9;
        }
    }
}

