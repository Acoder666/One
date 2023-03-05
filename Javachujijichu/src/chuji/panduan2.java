package chuji;

import java.util.Scanner;

public class panduan2 {
    public static void main(String[] args) {
        //简易自动售票机
        //初始化
        Scanner in = new Scanner(System.in);

        //读入投币金额
        System.out.println("请投币：");
        int amount = in.nextInt();
        if (amount >= 10)
        //打印车票
        System.out.println("******************");
        System.out.println("*Java城际铁路专线*");
        System.out.println("*票价：10元");
        System.out.println("******************");

        //计算并打印找零
        System.out.println("找零：" + (amount-10));
    }
}
