package chuji;

import java.util.Scanner;

public class shuzu3 {
    public static void main(String[] args) {
        double sum = 0;
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        if (cnt>0){
            int[] numbers = new int[cnt];
            for (int i=0;i<cnt;i++){
                numbers[i] = in.nextInt();
                sum = sum + numbers[i];
            }

            double average = sum/cnt;
            for (int i=0;i<cnt;i++){
                if (numbers[i] > average){
                    System.out.println(numbers[i]);
                }
            }
        }


    }
}
