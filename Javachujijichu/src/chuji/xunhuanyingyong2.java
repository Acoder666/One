package chuji;

import java.util.Scanner;

public class xunhuanyingyong2 {
    public static void main(String[] args) {
        //最大公约数 枚举
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int ret = 0;
        int i;
        for (i = 2; i <= a && i<=b; i=i+1){
            if (a%i == 0){
                if (b%i == 0){
                    ret = i;
                }
            }
        }
        System.out.println(a+"和"+b+"的最大公约数是"+ret);
    }
}
