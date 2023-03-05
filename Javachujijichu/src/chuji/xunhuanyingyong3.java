package chuji;

import java.util.Scanner;

public class xunhuanyingyong3 {
    public static void main(String[] args) {
        //辗转相除法
//        Scanner in = new Scanner(System.in);
//        int a,b;
//        int t;
//
//        a = in.nextInt();
//        b = in.nextInt();
//        int origa = a;
//        int origb = b;
//        while (b != 0){
//            t = a%b;
//            a = b;
//            b = t;
//        }
//        System.out.println(origa+"和"+origb+"的最大公约数是"+a);

        //正序分解整数
//        int x;
//        Scanner in = new Scanner(System.in);
//        x = in.nextInt();
//        do {
//            System.out.println(x%10);
//            x /= 10;
//        }while (x>0);

        //逆序输出一个整数
//        Scanner in = new Scanner(System.in);
//        int x = in.nextInt();
//        int y = 0;
//        do {
//            y = y * 10 + x % 10;
//            x /= 10;
//        }while (x>0);
//        System.out.println(y);

        //计算整数的模
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int mode = 1;
        int t = x;
        while (t > 9){
            mode *= 10;
            t /= 10;
        }

    }
}
