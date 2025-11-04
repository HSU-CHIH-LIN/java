import java.util.Scanner;
public class p8 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        int temp;
        String weather;
        System.out.print("請輸入temp");
        temp=scn.nextInt();
        System.out.print("請輸入天氣");
        weather=scn.next();
        if(temp>28){

            if(weather.equalsIgnoreCase("sun")){
                System.out.print("go swim");

            }
        else{
            System.out.print("gym");
        }
            }
            scn.close();
        }
    }
    

