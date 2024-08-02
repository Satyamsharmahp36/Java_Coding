package Abstraction;


abstract class Area{
    abstract double area();
    abstract void display();
}

class Rectangle extends Area{
    double length;
    double width;
    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }
    double area(){
        return length * width;
    }
    void display(){
        System.out.println("Area: " + area());
    }
}

class square extends Area{
    double length;

    square(double length){
        this.length = length;
    }
    double area(){
        return length * length;
    }
    void display(){
        System.out.println("Area: " + area());
    }
}



public class AbstractExample {
    public static void main(String[] args) {
        square s = new square(5);
        s.display();
        Rectangle r = new Rectangle(2,5);
        r.display();
    }
}
