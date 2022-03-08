package com.learn.day09;
/*
匿名对象的使用
1.我们创建的对象没有显式地赋给一个变量名。即为匿名对象
2.特征：匿名对象只能用一次，仅对当前语句有效。
3.开发使用：见PhoneMall(当做形参使用)
 */
public class InstanceTest {
    public static void main(String[] args) {
        Phone p = new Phone();

        //不是匿名对象
        p.sendEmail();
        p.playGames();

        //匿名对象
        new Phone().sendEmail();
        new Phone().price = 1999;
        new Phone().showPrice();//0.0 不是1999

        PhoneMall mall = new PhoneMall();
        //mall.show(p);
        mall.show(new Phone());
    }
}

class Phone {
    double price;

    public void sendEmail() {
        System.out.println("发送邮件");
    }

    public void playGames() {
        System.out.println("玩游戏");
    }

    public void showPrice() {
        System.out.println("手机的价格是" + price);
    }
}

class PhoneMall {
    public void show(Phone phone) {
        phone.sendEmail();
    }
}
