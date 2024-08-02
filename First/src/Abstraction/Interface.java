package Abstraction;


interface Animal{
    void sound();
}

class dog implements Animal{
    public void sound(){
        System.out.println("barks");
    }
}

class cat implements Animal{
    public void sound(){
        System.out.println("meow");
    }
}



public class Interface {

    public static void main(String[] args) {
        Animal dog = new dog();
        cat cat = new cat();
        dog.sound();
        cat.sound();
    }
}
