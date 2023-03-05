package chuji;

public class panduan5duolu {
    static int type;
    //switch-case
    public static void main(String[] args) {
//        if (type == 1)
//            System.out.println("你好");
//        else if (type == 2) {
//            System.out.println("早上好");
//        } else if (type == 3) {
//            System.out.println("晚上好");
//        } else if (type == 4) {
//            System.out.println("再见");
//        }
//        else
//            System.out.println("阿");

        switch (type){
            case 1:
                System.out.println("你好");
                break;
            case 2:
                System.out.println("早上好");
                break;
            case 3:
                System.out.println("晚上好");
                break;
            case 4:
                System.out.println("再见");
                break;
            default:
                System.out.println("啊，什么");
        }



    }
}
