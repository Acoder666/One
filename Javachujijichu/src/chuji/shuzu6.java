package chuji;

import java.util.Scanner;

public class shuzu6 {
    public static void main(String[] args) {
        //从2到x-1测试是否可以整除
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        boolean isPrime = true;
        if (x == 1){
            isPrime = false;
        }
        for (int i=2;i<x;i++){
            if (x % i == 0){
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(x+"是素数");
        }
        else {
            System.out.println(x+"不是素数");
        }

        //去掉偶数后，从3到x-1,每次加2
        if (x==1 || x %2 ==0 && x!= 2){
            isPrime = false;
        }
        else{
            for (int i=3;i<x;i+=2){
                if (x % i==0){
                    isPrime = false;
                    break;
                }
            }
        }



    }
}
