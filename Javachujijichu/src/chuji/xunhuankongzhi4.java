package chuji;

import java.util.Scanner;

public class xunhuankongzhi4 {
    public static void main(String[] args) {
        //凑硬币 如何用一角、2角和5角的硬币凑出10元以下的金额呢
//        Scanner in = new Scanner(System.in);
//        int amount = in.nextInt();
//        for (int one = 0; one <= amount; ++one){
//            for (int five = 0; five <= amount/5; ++five){
//                for (int ten = 0; ten <= amount/10; ++ten){
//                    for (int twenty = 0; twenty <= amount/20; ++twenty){
//                        if (one+five*5+ten*10+twenty*20 == amount){
//                            System.out.println(one+"张一元,"+five+"张5元，"+ten+"张10元，"+twenty+"张20元,=="+amount);
//                        }
//                    }
//                }
//            }
//        }
        //do-while
        Scanner scan = new Scanner(System.in);
        int amount;
        do {
            System.out.println("请输入金额（1-100）");
            amount = scan.nextInt();
        }while (amount <1 || amount > 100);
        Outer:
        for (int one = 0;one <=amount; ++one)
            for (int five = 0; five <= amount/5;++five)
                for (int ten = 0;ten <=amount/10;++ten)
                    for (int twenty = 0;twenty <= amount/20;++twenty)
                        if (one + five*5 + ten*10 + twenty*20 == amount){
                            System.out.println(one+"张一元，"+five+"张5元，"+ten+"张10元，"+twenty+"张20元->"+amount);
                            break Outer;
                        }



    }
}
