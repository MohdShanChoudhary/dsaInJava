// super refers to the parent class (superclass) of the current object.

// It is used to access parent class members (variables, methods, or constructors) from a subclass.

// Common uses:

// Call parent class constructor.

// Access parent class methods when overridden.

// Access parent class variables if hidden by subclass variables.

class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    Dog() {
        super(); // Calls parent class constructor
        System.out.println("Dog constructor called");
    }

    void sound() {
        System.out.println("Dog barks");
    }

    void showDetails() {
        super.sound();            // Calls parent class method
        System.out.println(name);        // Child class variable
        System.out.println(super.name);  // Parent class variable
    }
}


public class SuperCalss10{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.showDetails();
    }
}