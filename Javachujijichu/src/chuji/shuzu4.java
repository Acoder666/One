package chuji;

import java.util.Scanner;

public class shuzu4 {
    public static void main(String[] args) {
        //投票统计
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[10];
        int x;
        x = in.nextInt();
        while (x != -1){
            if (x>0 && x<=9){
                numbers[x] ++;
            }
            x=in.nextInt();
        }
        for (int i=0;i<numbers.length;i++){
            System.out.println(i+":"+numbers[i]);
        }
    }
}
