import java.util.Scanner;
import java.util.Random;
class Gamee{
    public int Compinput;
    public int Userinput;
    public int Counter=0;
    public Gamee(){
        Random random=new Random();
        Compinput=random.nextInt(10);
    }
    public void getnum(int n){
        Userinput=n;
    }
    public boolean Check(){
        if(Userinput>Compinput){
            System.out.println("Given number is bigger.Guess less than number");
            Counter++;
            return false;
        }
        else if(Userinput<Compinput){
            System.out.println("Given number is smaller.Guess large than number");
            Counter++;
            return false;
        }
        else if(Userinput==Compinput){
            System.out.println("Right guess!");
            System.out.println("No of guess:"+Counter);
            return true;
        }
        else{
            System.out.println("Invalid input.Try again!");
            return false;
        }

    }
}
public class Game {
    public static void main(String[] args) {
        
        Gamee player = new Gamee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number from 0-10: ");
        player.getnum(sc.nextInt());
        while(player.Check()==false){
            System.out.println("Try Again!!");
            player.getnum(sc.nextInt());
        }
        sc.close();
    }
}
