import java.util.Scanner;
public class p6 {
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);

        System.out.print("你叫什麼名字？");
        String name=scn.next();
        System.out.print("你住在哪裡？");
        String city=scn.next();
        scn.close();
        System.out.print("我叫做"+name+"住在"+city);


        boolean isGirl=true;
        System.out.print("\n是否為女生"+isGirl);

       

    }

}
