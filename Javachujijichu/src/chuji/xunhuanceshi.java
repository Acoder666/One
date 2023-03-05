package chuji;

import java.util.Scanner;

public class xunhuanceshi {
    public static void main(String[] args) {
        //调试
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        int count = 0;
        while (number > 0){
            number = number / 10;
            count = count + 1;
        }
        System.out.println(count);

        //do-while循环
//        int x;
//        Scanner in = new Scanner(System.in);
//        int n = 0;
//        do {
//            x = x/10;
//            n = n+1;
//        }while (x > 0);
//        System.out.println(n);

    }
}
