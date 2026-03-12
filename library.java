import java.util.Scanner;
class libraryfunc{

    String []arr={"love story","comics","thriller","crime","comedy","murder","horror","detective","lessons"};

    String []iarr={"science","childrens","biology","poems"};

    int l=arr.length;

    void addbooks(String add){
        for(int i=0;i<l;i++){
            if(arr[i]==add){
                System.out.println("book already exists");
            }
            else{
                arr[l]=add;
                System.out.println("book added successfully");
                l++;
            }
        }
    }
    void issuebook(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter book name to issue:");
        String ibook=sc.next();
        for(int i=0;i<l;i++){
            if(ibook==arr[i]){
                System.out.println("Book issued!");
                iarr[iarr.length]=ibook;
            }
        }
        sc.close();
    }
    void returnbook(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Book name to return:");
        String rebook=sc.next();
        arr[l]=rebook;
        sc.close();
    }
    void showavailablebooks(){
        for(int i=0;i<l;i++){
            System.out.print(arr[i]+" ");
        }
    }

}
public class library {
    public static void main(String[] args) {
        
        libraryfunc lib1=new libraryfunc();
        lib1.showavailablebooks();
    
        
    }
}
