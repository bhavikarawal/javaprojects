class Aanimal{
    public void animals(){
        System.out.println("Animal class.");
    }
}
class Dog extends Aanimal{
    public void bark(){
        System.out.println("Dog barks.");
    }
}
public class Animal {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.animals();
        d.bark();
    }
}
