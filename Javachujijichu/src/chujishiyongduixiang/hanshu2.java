package chujishiyongduixiang;

public class hanshu2 {
    public static void main(String[] args) {
        //求和
    sum(1,10);
    sum(20,30);
    sum(35,45);
    }

    public static void sum(int a,int b){
        int i;
        int sum=0;
        for (i=a;i<=b;i++){
            sum +=i;
        }
        System.out.println(a+"到"+b+"的和是"+sum);
    }



}
