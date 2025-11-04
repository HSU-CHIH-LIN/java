import java.util.Scanner;
public class p13{  
public static void main(String[]args){
        Scanner scn=new Scanner(System.in);

        double r=5;
        double pi=3.14;
        System.out.println("1.圓面積２.正方形面積");
        int choice;
        System.out.print("選擇的數字");
        choice=scn.nextInt();

        switch(choice){
            case 1:
                System.out.print(r*r*pi);
                break;
            case 2:
                System.out.print(r*r);
                break;
            default:
                System.out.print("無法計算面積");
            break;
        }
    }

}

