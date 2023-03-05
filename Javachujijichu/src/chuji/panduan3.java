package chuji;

import java.util.Scanner;

public class panduan3 {
    public static void main(String[] args) {
        final  int MINOR = 35;
        System.out.println("请输入你的年龄：");
        Scanner in = new Scanner(System.in);

        int age = in.nextInt();

        System.out.println("你的年龄是"+age);

        if (age < MINOR){
            System.out.println("年轻是美好的");
        }

        System.out.println("年龄决定了你的精神世界，好好珍惜吧。");

        //比较数的大小
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int y = in.nextInt();
//        int max;
//        if ( x > y){
//            max = x;
//        }
//        System.out.println(max);

//        final double RATE = 8.25;
//        final int STANDRD = 40;
//        double pay = 0.0;
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter");
//        int hours = in.nextInt();
//        System.out.println();
//        if (hours > STANDRD)
//            pay = STANDRD * RATE + (hours-STANDRD) * (RATE * 1.5);
//        else
//            pay = hours *RATE;
//        System.out.println("Gross" + pay);

//        final int PASS = 60;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("请输入成绩：");
//        int score = scan.nextInt();
//        System.out.println("你输入的成绩是"+score);
//        if (score < PASS)
//            System.out.println("没及格");
//        else
//            System.out.println("及格了");
//        System.out.println("再见");


    }
}
