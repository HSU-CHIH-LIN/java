import java.util.Scanner;

import javax.sound.sampled.Line;
public class p2 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);
        System.out.print("What is your name?");
        String name=scn.next();
        System.out.print("How old are you?");
        int age=scn.nextInt();
        
        System.out.println("我的名字是"+name+"\n今年"+age+"歲");
        scn.close();





    }    
}
