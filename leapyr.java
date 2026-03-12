import java.util.Scanner;
/*public class boardcalc {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter subject 1 marks:");
        float sub1 =sc.nextFloat();
        System.out.println("Enter subject 2 marks:");
        float sub2 =sc.nextFloat();
        System.out.println("Enter subject 3 marks:");
        float sub3=sc.nextFloat();
        System.out.println("Enter subject 4 marks:");
        float sub4=sc.nextFloat();
        System.out.println("Enter subject 5 marks:");
        float sub5=sc.nextFloat();
        float sum=sub1+sub2+sub3+sub4+sub5;
        float percentage=sum*100/500;
        System.out.println("percentage of the student is ");
        System.out.println(percentage);

    }
}*/
public class leapyr{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year:");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){
            System.out.println("leap year");
        }
        else{
            System.out.println("not leap year");
        }
        sc.close();
    }
}
