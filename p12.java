import java.util.Scanner;
public class p12 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);

        int number;

        System.out.print("請輸入一個整數");
        number=scn.nextInt();
        
        if(number>0){
            if(number%2==0){
                System.out.println("這是一個正的偶數.");
            }
            else if(number%2!=0){
                System.out.println("這是一個正的奇數.");
            }
        }
          else if (number<0){
            System.out.println("這是一個負數.");
          }  
          else if(number==0){
            System.out.print("這是零。");
          }
          scn.close();
        }
        
    }


