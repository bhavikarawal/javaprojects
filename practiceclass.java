class Rectangle{
    int l;
    int b;
    public int Area(){
        return l*b;
    }
    public int perimeter(){
        return 2*(l+b);
    }
}
class Circle{
    int r;
    public float area(){
        return 3.14f*r*r ;
    }
    public float perimeter(){
        return 2*3.14f*r;
    }
}
public class practiceclass {
    public static void main(String[] args) {
        /* 
        Rectangle rect = new Rectangle();
        rect.l=4;
        rect.b=5;
        System.out.println(rect.Area());
        System.out.println(rect.perimeter());
        */
       Circle cir = new Circle();
       cir.r=10;
       System.out.println(cir.area());
       System.out.println(cir.perimeter());

    }
}
