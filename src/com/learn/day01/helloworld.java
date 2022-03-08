
package com.learn.day01;
//public 只能加到同名类
/*
编译完源程序以后，生成一个或多个字节码文件(class),我们使用JVM中的类加载器和解释器对生成的字节码文件进行解释运行
意味着需要将字节码文件对应的类加载到内存中，涉及到内存解析。
 */
public class helloworld {
    /*
    常用输出语句： println 换行
                 print  不换行
     */
    public static void main(String[] args) {
        System.out.println("helloworld\n");
        System.out.println("hello");

    }
}

class hello{
    public static void main(String[] args) {
        System.out.println("hello");
    }
}

