import java.util.Scanner;
public class p11{
    public static void main(String[]args){
        Scanner scn=new Scanner(System.in);

        String name;
        int rank;

        System.out.print("請輸入名字");
        name=scn.next();
        System.out.print("請輸入名次");
        rank=scn.nextInt();

        if(rank==1){
            System.out.println(name+"獲得獎金5000元");
        }
        else if(rank==2){
            System.out.println(name+"獲得獎金3000元");
        }
        else{
            System.out.println(name+"獲得獎金1000元");
        }
        scn.close();
    }



}
