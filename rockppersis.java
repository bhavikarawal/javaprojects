import java.util.Scanner;
import java.util.Random;
public class rockppersis {
    public static void main(String[] args) {
        Random randomnum= new Random();
        System.out.println("computer number:");
        int value=randomnum.nextInt(1,(3)+1);
        System.out.println(value);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for rock,2 for scissors,3 for paper");
        int user=sc.nextInt();
        if((user==1 && value==2)||(user==2 && value==3)||(user==3 && value==1)) {
            System.out.println("user wins because computer value is"+value);
        }
        else if ((value==1 && user==2)||(value==2 && user==3)||(value==3 && user==1)){
            System.out.println("Compuer wins because user entered:"+user);
        }
        else{
            System.out.println("Match drawn");
        }
        sc.close();
    }
    
}
