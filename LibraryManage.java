import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

class LibManage{
    ArrayList<String[]> Books=new ArrayList();
    String Bname;
    String Aname;
    String UserName;
    String issueTo;
    String issuedOn;
    String reg;
    ArrayList<String> regList=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    void Add_Book(){
        System.out.println("Enter book name:");
        Bname=sc.nextLine();
        System.out.println("Enter Author Name:");
        Aname=sc.nextLine();
        issuedOn=null;
        issueTo=null;
        String []book={Bname,Aname,issuedOn,issueTo};
        Books.add(book);
        System.out.println("Book Added!");
    }
    void Return_Book(){
        System.out.println("Enter book to return:");
        Bname=sc.nextLine();
        System.out.println("Enter Author name:");
        Aname=sc.nextLine();
        issuedOn=null;
        issueTo=null;
        String []book={Bname,Aname,issuedOn,issueTo};
        Books.add(book);
        System.out.println("Book returned!");
    }
    void Issue_Book(){
        String Ibook;
        System.out.println("Are you registered in library?(Yes/No):");
        reg=sc.nextLine();
        if(reg.equalsIgnoreCase("Yes")){
            System.out.println("Enter your Name:");
            UserName=sc.nextLine();
            if(regList.contains(UserName)){
                System.out.println("Yes,You are registered!");
                boolean found=false;
            System.out.println("Enter Name to Register:");
            UserName=sc.nextLine();
            regList.add(UserName);
            System.out.println("Enter Book to issue:");
            Ibook=sc.nextLine();
            for(int i=0;i<Books.size();i++){
                String[] arr=Books.get(i);
                String bbname=arr[0];
                if(Ibook.equalsIgnoreCase(bbname)){
                    Books.remove(i);
                    LocalDate d=LocalDate.now();
                    arr[2]=d.toString();
                    arr[3]=UserName;
                    System.out.println("Book Issued on");
                    found=true;
                }
                
            }
            if(found==false){
                System.out.println("Book not found!");
            }
            }
            else{
                System.out.println("You are not registered.");
                System.out.println("Try Again!");
            }
        }
        else{
            boolean found=false;
            System.out.println("Enter Name to Register:");
            UserName=sc.nextLine();
            regList.add(UserName);
            System.out.println("Enter Book to issue:");
            Ibook=sc.nextLine();
            for(int i=0;i<Books.size();i++){
                String[] arr=Books.get(i);
                String bbname=arr[0];
                if(Ibook.equalsIgnoreCase(bbname)){
                    Books.remove(i);
                    LocalDate d=LocalDate.now();
                    arr[2]=d.toString();
                    arr[3]=UserName;
                    Books.add(arr);
                    System.out.println("Book Issued");
                    found=true;
                }
                
            }
            if(found==false){
                System.out.println("Book not found!");
            }
        }
    }
    void Show_Books(){
        System.out.println("Available Books:"+Books);
    }
}

public class LibraryManage {
    public static void main(String[] args) {
        LibManage Lm=new LibManage();
        Lm.Add_Book();
        Lm.Show_Books();
        //Lm.Return_Book();
        Lm.Issue_Book();
        Lm.Show_Books();

    }
}
