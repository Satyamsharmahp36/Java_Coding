class Car {
    void tire() {
        System.out.println("Car have 4 tire");
    }
}

interface Luxury{
    void features();
}

class Alto extends Car { // Hierarchical Inheritance (Alto and Audi from Car)
    void engine() {
        System.out.println("Alto have 800cc");
    }
}

// Single Inheritance
class Audi extends Car { // Hierarchical Inheritance (Alto and Audi from Car)
    void engine() {
        System.out.println("Audi have 2000cc");
    }
}

// Single Inheritance
class AudiQ3 extends Audi { // Multilevel Inheritance (AudiQ3 from Audi from Car)
    void price() {
        System.out.println("AudiQ3 price is $1500 More than normal audi");
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
