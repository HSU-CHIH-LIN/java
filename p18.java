import java.util.Scanner;
public class p18 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        boolean ispass=false;
        String  pwd;
        for(int i=1;i <= 3;i++){
            System.out.print("imput pwd");
            pwd=scn.next();
            if(pwd.equals("123")){
                ispass=true;
                break;
            }
           
        }
        if(ispass==true){
            System.out.print("login success");
        }
        else{
            System.out.print("login fail");
        }

    }
    
}
