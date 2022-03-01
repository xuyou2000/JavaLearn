package com.learn.day05;
/*
break：结束当前循环
continue：跳过当次循环
return：用于结束方法，不是循环
 */
public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if(i%10==0){
                continue;
            }
            //System.out.println(i);
        }

        //带标签的break和continue  默认退出的是最近的这次循环
        label1:
        for (int i = 0; i < 4; i++) {
            label2:
            for (int j = 1; j <= 50; j++) {
                if(j%4==0)
                    break label1;
                    //continue label1;
                System.out.println(j);
            }
        }
    }
}
