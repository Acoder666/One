package chuji;

import java.util.Scanner;


public class shuzu5 {
    public static void main(String[] args) {
        //数组
//        int[] a1 = {1,2,3,4,5};
//        int[] a2 = a1;
//        for (int i=0;i<a2.length;i++){
//            a2[i]++;
//        }
//        for (int i=0;i<a1.length;i++){
//            System.out.println(a1[i]);
//        }

        Scanner in = new Scanner(System.in);
//        int[] data = {2,3,5,7,4,9,11,34,12,28};
//        int x = in.nextInt();
//        int loc = -1;
//        for (int i=0;i<data.length;i++){
//            if (x == data[i]){
//                loc = i;
//                break;
//            }
//        }
//        if (loc > -1){
//            System.out.println(x+"是第"+(loc+1)+"个");
//        }
//        else{
//            System.out.println(x+"不在其中");
//        }

        //另一种写法
        int[] data = {2,3,5,7,4,9,11,34};
        int x = in.nextInt();
        boolean found = false;
        for (int k:data){
            if (x == k){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println(x+"在其中");
        }else {
            System.out.println(x+"不在其中");
        }


    }
}
