
abstract class Animal {
    abstract void sound();

    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Abstractclass7 {
    

    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();  // Output: Dog barks
        d.eat();    // Output: This animal eats food.
    }
}
//    abstract class 
// =Declared using the abstract keyword.

// =Can have abstract methods (without body) and concrete methods (with body).

// =Cannot be instantiated directly.

// = can not make a object but make a constructor 