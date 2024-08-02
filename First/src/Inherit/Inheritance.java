package Inherit;

class Car {
    void tire() {
        System.out.println("Inherit.Car have 4 tire");
    }
}

interface Luxury{
    void features();
}

class Alto extends Car { // Hierarchical Inherit.Inheritance (Inherit.Alto and Inherit.Audi from Inherit.Car)
    void engine() {
        System.out.println("Inherit.Alto have 800cc");
    }
}

// Single Inherit.Inheritance
class Audi extends Car { // Hierarchical Inherit.Inheritance (Inherit.Alto and Inherit.Audi from Inherit.Car)
    void engine() {
        System.out.println("Inherit.Audi have 2000cc");
    }
}

// Single Inherit.Inheritance
class AudiQ3 extends Audi { // Multilevel Inherit.Inheritance (Inherit.AudiQ3 from Inherit.Audi from Inherit.Car)
    void price() {
        System.out.println("Inherit.AudiQ3 price is $1500 More than normal audi");
    }
}


class newAudi extends Car implements Luxury{
    @Override
    public void features() {
        System.out.println("It is powerful");
    }
}




public class Inheritance {
    public static void main(String[] args) {
        Car myCar = new Car();
        Alto myAlto = new Alto();
        Audi myAudi = new Audi();
        AudiQ3 myAudiQ3 = new AudiQ3();

        myCar.tire();
        myAlto.tire();
        myAlto.engine();
        myAudi.tire();
        myAudi.engine();
        myAudiQ3.tire();
        myAudiQ3.engine();
        myAudiQ3.price();
    }
}
