import java.util.Scanner;
public class p4 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.print("居住的城市？");
        String city=scn.next();
        System.out.print("通勤時間？"+"小時");
        int time=scn.nextInt();

        System.out.println("我住在"+city+"\n每天通勤時間"+time+"分鐘");
        scn.close();
        

    }
    
}
