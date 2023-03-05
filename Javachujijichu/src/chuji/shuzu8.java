package chuji;

public class shuzu8 {
    public static void main(String[] args) {
        //构造素数表
        boolean[] isPrime = new boolean[100];
        for (int i=2; i>isPrime.length;i++){
            isPrime[i] = true;
        }

        for (int i=2; i<isPrime.length;i++){
            if (isPrime[i]){
                for (int k=2;i*k<isPrime.length;k++){
                    isPrime[i*k] = false;
                }
            }
        }
        for (int i = 0; i<isPrime.length;i++){
            if (isPrime[i]){
                System.out.println(i+" ");
            }
        }
        System.out.println();


        //二维数组
//        int[][] a = new[3][5];

        //二维数组的遍历
//        for (i=0;i<3;i++){
//            for (j=0;j<5;j++){
//                a[i][j] = i*j;
//            }
//        }

        //二维数组的初始化
//        int[][] a = {{1,2,3,4},{1,2,3}};

    }
}
