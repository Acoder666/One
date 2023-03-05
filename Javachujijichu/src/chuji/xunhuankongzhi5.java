package chuji;

import java.util.Scanner;

public class xunhuankongzhi5 {
    public static void main(String[] args) {
        //逻辑运算
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int isPrime = 1;
        for (int i = 2; i<n; i++){
            if (n % i==0){
                isPrime = 0;
                System.out.println(n+"不是素数,i="+i);
                break;
            }
        }
        if (isPrime==1){
            System.out.println(n+"是素数");
        }else {
            System.out.println(n+"不是素数");
        }
    }
}
