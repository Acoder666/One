package chuji;

import java.util.Scanner;

public class xunhuankongzhi2 {
    public static void main(String[] args) {
        //素数 只能被1和自己整除的数，不包括1 2,3,5,7,11,13,17,19...
        int isPrime = 1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 2; i<n; i++){
            if (n % i ==0){
                isPrime = 0;
                System.out.println(n+"不是素数,i="+i);
                break;
            }
        }
        if (isPrime == 1){
            System.out.println(n+"是素数");
        }
        else {
            System.out.println(n+"不是素数");
        }

    }
}
