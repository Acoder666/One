package chuji;

import java.util.Scanner;

public class shuzu {
    public static void main(String[] args) {
        //计算用户输入的数字的平均数
        Scanner in = new Scanner(System.in);
        int x;
        double sum = 0;
        int cnt = 0;
        x = in.nextInt();
        while (x != -1){
            sum = sum + x;
            cnt ++;
            x = in.nextInt();
        }
        if (cnt > 0){
            System.out.println(sum/cnt);
        }
    }
}
