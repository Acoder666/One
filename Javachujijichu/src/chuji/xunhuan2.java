package chuji;

import java.util.Scanner;

public class xunhuan2 {
    public static void main(String[] args) {
        //计数循环
//        int count = 100;
//        while (count >= 0){
//            count = count - 1;
//            System.out.println(count);
//        }
//        System.out.println("发射！");

        //do-while
//        int count = 10;
//        do {
//            System.out.println(count);
//            count = count - 1;
//        }while (count > 0);
//        System.out.println("发射！");

        //猜数游戏
        Scanner in = new Scanner(System.in);
        int number = (int)(Math.random()*100+1);
        int count = 0;
        int a = 0;
        System.out.println("1到100");
        do {
            System.out.println("猜");
            a = in.nextInt();
            count ++;
            if (a>number){
                System.out.println("大了");
            } else if (a < number) {
                System.out.println("小了");
            }
        }while (a != number);
        System.out.println("你用了"+count);


    }
}
