package chuji;

import java.util.Scanner;

public class xunhuankongzhi1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int factor = 1;
//        int i =1;
//        while (i<=n){
//            factor = factor * i;
//            i = i +1;
//        }
//        System.out.println(factor);
        for (int i=1;i<=n;i=i+1){
            factor = factor * i;
        }
        System.out.println(factor);

    }
}
