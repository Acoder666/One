package chuji;

public class shuzu7 {
    public static void main(String[] args) {
        //判断是否能被已知的且<x的素数整除 构造前50个素数的表
        int[] primes = new int[50];
        primes[0] = 2;
        int cnt =1;

        for (int x=3; cnt<primes.length;x++){
            for (int i=0;i<cnt;i++){
                if (x % primes[i] == 0){
                    continue;
                }
            }
            primes[cnt++] = x;
        }
        for (int k:primes){
            System.out.println(k+" ");
        }
        System.out.println();
    }
}
