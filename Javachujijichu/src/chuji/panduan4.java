package chuji;

import java.util.Scanner;

public class panduan4 {
    public static void main(String[] args) {
        //找三个数钟的最大
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        System.out.println("请输入两个数");
        a = in.nextInt();
        b = in.nextInt();
        int max = 0;
        if (a>b){
            max = a;
        }else{
            max = b;
        }
        System.out.println(max);

//        if (x>y){
//            if (x>z){
//                max = x;
//            }
//            else {
//                max = z;
//            }
//        }
//        else {
//            if (y>z){
//                max =y;
//            }else {
//                max = z;
//            }
//        }

    }
}
