package com.learn.Project01;

/*
使用不同编码的文件时，先reload再convert即可 默认使用utf-8
 */
public class FamilyAccount {
    public static void main(String[] args) {
        boolean isFlag = true;
        int money = 50000;
        String details = "收支\t账户金额\t收支金额\t说    明\n";
        while (isFlag) {
            System.out.println("\n-----------------家庭收支记账软件-----------------\n");
            System.out.println("                   1 收支明细");
            System.out.println("                   2 登记收入");
            System.out.println("                   3 登记支出");
            System.out.println("                   4 退    出");
            System.out.println("                当前余额为：" + money+"元\n");
            System.out.print("                   请选择(1-4)：");

            char selection = Utility.readMenuSelection();
            switch (selection) {
                case '1':
                    System.out.println("-----------------当前收支明细记录-----------------");
                    System.out.println(details);
                    System.out.println("--------------------------------------------------");
                    break;

                case '2':
                    System.out.print("请输入本次收入金额：");
                    int inMoney = Utility.readNumber();
                    System.out.print("本次收入说明：");
                    String inComment = Utility.readString();
                    money += inMoney;
                    details += "收入\t" + money + "   " + inMoney + "      " + inComment + '\n';
                    System.out.println("---------------------登记完成---------------------");
                    break;

                case '3':
                    System.out.print("请输入本次支出金额：");
                    int outMoney = Utility.readNumber();
                    System.out.print("本次支出说明：");
                    String outComment = Utility.readString();
                    money -= outMoney;
                    details += "收入\t" + money + "   " + outMoney + "      " + outComment + '\n';
                    System.out.println("---------------------登记完成---------------------");
                    break;

                case '4':
                    System.out.print("确认是否退出(Y/N)：");
                    char isExit = Utility.readConfirmSelection();
                    if (isExit == 'Y') isFlag = false;
                    break;

            }

        }
    }
}
