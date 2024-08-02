package Polymorphism;

class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class RunTime {
    public static void main(String[] args) {
        Animal a=new Dog();
        a.makeSound();
        Animal b=new Cat();
        b.makeSound();
    }
}
