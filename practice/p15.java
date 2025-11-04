import java.util.Scanner;
public class p15{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter your grade(A-D)");
        String grade=scn.next();
        switch (grade){
            case "A" :
            System.out.print("Your result:Excellent");
            break;

            case "B":
            System.out.print("Your result:Good");
            break;

            case "C" :
            System.out.print("Your result:Pass");
            break;

            case "D" :
            System.out.print("Your result:Fall");
            break;

            default:
            System.out.print("Invalid grade");

           


        }
         scn.close();
    }
}
