package chuji;

import java.util.Scanner;

public class shuzu2 {
    public static void main(String[] args) {
        //写一个程序计算用户输入的数字的平均数，并输出所有大于平均数的数
        Scanner in = new Scanner(System.in);
        int x;
        double sum = 0;
        int cnt = 0;
        int[] numbers = new int[100];
        x = in.nextInt();
        while (x!=-1){
            numbers[cnt] = x;
            sum = sum + x;
            cnt ++;
            x=in.nextInt();
        }
        if (cnt>0){
            double average = sum/cnt;
            for (int i=0;i<cnt;i++){
                if (numbers[i] > average){
                    System.out.println(numbers[i]);
                }
            }
        }

        //数组
//        int[] numbers = new int[4];
//        numbers[0] = 1;
//        numbers[1] = 2;
//        numbers[2] = 3;
//        numbers[3] = 4;

    }
}
