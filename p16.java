import java.util.Scanner;
public class p16{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);

        System.out.print("Enter parking time");
        int hour=scn.nextInt();
        System.out.print("Enter your vehicle name");
        String vehicleName=scn.next();

        switch(vehicleName){
          case"motorcycle":
          System.out.print(vehicleName+"總停車費"+(20*hour));
          break;
          case"car":
          System.out.print(vehicleName+"總停車費"+(40*hour));
          break;
          case"bus":
          System.out.print(vehicleName+"總停車費"+(80*hour));
          break;

          default:
          System.out.print("無法辨識的車輛名稱"+vehicleName);
          }
          scn.close();
        }

       
            
        
    }


