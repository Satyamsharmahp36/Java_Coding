package Polymorphism;

class Parent {
    void display() {
        System.out.println("Parent's display method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child's display method");
    }

    // New method unique to Child class
    void display(int num) {
        System.out.println("Child's display method with number: " + num);
    }
}

public class RuntimeError {
    public static void main(String[] args) {
        Parent parent = new Child();
        parent.display();  // This will call Child's display() method due to runtime polymorphism

        // To call the method with int parameter, we need to cast to Child
        Child child = (Child) parent;
        child.display(20); // This works and calls Child's display(int num) method
    }
}
