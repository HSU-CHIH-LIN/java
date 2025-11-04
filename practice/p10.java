import java.util.Scanner;
public class p10{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);

        final int MAX_TICKETS=5;
        int tickets_price=1280;

        System.out.print("Please enter your name:");
        String name=scn.next();

        System.out.print("How many tickets would you like to buy(MAX:"+MAX_TICKETS+"):");
        int numtickets=scn.nextInt();

        int total=numtickets*tickets_price;

        System.out.print(name+",you have successfully booked "+ numtickets+" tickets,total is$"+total+".");
        scn.close();
       
    }
}
   
