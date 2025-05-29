
abstract class Animal {                     // WE CAN NOT CREATE AN OBJECT OF ABSTRACT CLASS 
    abstract void sound();               // THEY HAVE CONSTRUCTOR TO SET  INITAL VALUE 

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

// =Can have abstract methods (without body) 

// =Cannot be instantiated directly.

// = can not make a object but make a constructor 