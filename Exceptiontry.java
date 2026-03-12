class InputException extends Exception{
    public String toString(){
        return "invalid input";
    }
}
class CannotDivideByZeroEx extends Exception{
    public String toString(){
        return "Cannot divide by Zero";
    }
}
class MaxInputExp extends Exception{
    public String toString(){
        return "Input should be less than 100000";
    }
}
class MaxMultiplierReachedExp extends Exception{
    public String toString(){
        return "Input should be less than 7000";
    }
}
class Calculator{
    public void Addition(double a,double b){
        try{
            if(a==8||b==8||a==9||b==9){
                throw new InputException();
            }
            else if(a>=100000||b>=100000){
                throw new MaxInputExp();
            }
            else{
                System.out.println("Sum="+(a+b));
            }
        }
        catch(InputException e){
            System.out.println(e.toString());
        }
        catch(MaxInputExp e){
            System.out.println(e.toString());
        }
    }
     
    public void Subtraction(double a,double b){
        try{
            if(a==8||b==8||a==9||b==9){
                throw new InputException();
            }
            else if(a>=100000||b>=100000){
                throw new MaxInputExp();
            }
            else{
                System.out.println("Subraction="+(a-b));
            }
        }
        catch(InputException e){
            System.out.println(e.toString());
        }
        catch(MaxInputExp e){
            System.out.println(e.toString());
        }
    }
    public void Multiplication(double a,double b){
         try{
            if(a==8||b==8||a==9||b==9){
                throw new InputException();
            }
            else if(a>=7000||b>=7000){
                throw new MaxMultiplierReachedExp();
            }
            else{
                System.out.println("Multiplication="+(a*b));
            }
        }
        catch(InputException e){
            System.out.println(e.toString());
        }
        catch(MaxMultiplierReachedExp e){
            System.out.println(e.toString());
        }
    }
    public void Division(double a,double b){
        try{
            if(a==8||b==8||a==9||b==9){
                throw new InputException();
            }
            else if(a==0||b==0){
                throw new CannotDivideByZeroEx();
            }
            else{
                System.out.println("Division="+(a/b));
            }
        }
        catch(InputException e){
            System.out.println(e.toString());
        }
        catch(CannotDivideByZeroEx e){
            System.out.println(e.toString());
        }
    }
}    
public class Exceptiontry {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        c.Addition(10.0,8);
        c.Subtraction(8,100000);
        c.Multiplication(7000,70000);
        c.Division(2,0);
    }
}
