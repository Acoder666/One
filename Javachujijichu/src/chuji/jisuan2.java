package chuji;

import java.util.Scanner;

public class jisuan2 {
    public static void main(String[] args) {
        //计算身高的程序
        Scanner in = new Scanner(System.in);
        System.out.print("请分别输入身高的英尺和英寸");
        int foot = in.nextInt();
        int inch = in.nextInt();
        System.out.println("身高是："+((foot + inch /12.0) * 0.3048) + "米");

        //强制类型转换
//        int i = 32 / 3.0;
//        int i = (int)(32 / 3.0);

        double b = 10.3;
        int a = (int)b;

    }
}
