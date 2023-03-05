package chuji;

import java.util.Scanner;

public class xunhuanyingyong1 {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        double result = 0.0;
//        for (int i=1;i<n;i=i+1){
//            result = result + 1.0 /i;
//        }
//        System.out.println(result);
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sign = 1;
        double result = 0.0;
        for (int i=1;i<=n;i=i+1){
            result = result + sign * 1.0 / i;
            sign = - sign;
        }
        System.out.println(result);

    }
}
