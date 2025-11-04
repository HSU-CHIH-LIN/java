import java.util.Scanner;
public class p5 {
    public static void main(String[]aStrings){
        Scanner scn=new Scanner(System.in);

        System.out.print("請問名字是？");
        String name =scn.next();
        System.out.print("請問年齡是？");
        int age=scn.nextInt();
        System.out.print("請問居住的城市？");
        String city=scn.next();
        scn.close();

        System.out.println("我的名字是"+name+"\n今年"+age+"歲"+"\n我住在"+city);
        
    }
    
}
