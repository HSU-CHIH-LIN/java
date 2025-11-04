import java.util.Scanner;
public class p14{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter drink number");
        int number=scn.nextInt();
        switch (number){
            case 1 :
            System.out.print("You selected coffee");
            break;

            case 2 :
            System.out.print("You selected Tea");
            break;

            case 3 :
            System.out.print("You selected Juice");
            break;

            case 4 :
            System.out.print("You selected Soda");
            break;

            default:
            System.out.print("Invalid selection");

           


        }
         scn.close();
    }
}