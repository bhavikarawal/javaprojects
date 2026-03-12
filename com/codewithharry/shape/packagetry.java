package com.codewithharry.shape;
class Rectangle{
    int length;
    int breadth;

    void setLength(int length){
        this.length=length;
    }
    int getLength(){
        return this.length;
    }
    void setBreadth(int breadth){
        this.breadth=breadth;
    }
    int getBreadth(){
        return this.breadth;
    }
    void rectArea(){
        System.out.println("Area of rectangle:"+this.length*this.breadth);
    }
}
class Square{
    int size;
    void setsize(int size){
        this.size=size;
    }
    int getsize(){
        return this.size;
    }
    void sqArea(){
        System.out.println("Area of Square:"+this.size*this.size);
    }
}
class Circle{
    int rad;
    void setrad(int rad){
        this.rad=rad;
    }
    int getrad(){
        return this.rad;
    }
    void cArea(){
        System.out.println("Area of circle:"+Math.PI*rad*rad);
    }
}
class Cylinder extends Circle{
    int height;
    void setheight(int height){
        this.height=height;
    }
    void CSAcylinder(){
        System.out.println("CSA of cylinder:"+2*Math.PI*rad*height);
    }
    void volcylinder(){
        System.out.println("Volume of cylinder:"+Math.PI*rad*rad*height);
    }
}
class Sphere extends Circle{
    void spArea(){
        System.out.println("Area of Sphere:"+4*Math.PI*rad*rad);
    }
    void spvol(){
        System.out.println("Volume of sphere:"+(4/3)*Math.PI*rad*rad*rad);
    }
}
public class packagetry {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.setLength(4);
        r.setBreadth(5);
        r.rectArea();

        Square s=new Square();
        s.setsize(6);
        s.sqArea();

        Circle c=new Circle();
        c.setrad(2);
        c.cArea();

        Cylinder cy=new Cylinder();
        cy.setrad(4);
        cy.setheight(5);
        cy.CSAcylinder();
        cy.volcylinder();

        Sphere sp=new Sphere();
        sp.setrad(4);
        sp.spArea();
        sp.spvol();
    }
}
