
public class INterface8 {

    public static void main(String[] args) {
        Animal d = new Dog();
        Animal c = new Cat();

        d.sound();  // Output: Dog barks
        c.sound();  // Output: Cat meows

    }

}
// Define the interface

interface Animal {

    void sound();  // abstract method
}

// Implementing the interface
class Dog implements Animal {

    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat implements Animal {

    public void sound() {
        System.out.println("Cat meows");
    }
}







// 2 interface / multiple inheritance
// = it is blueprint of a class
// =An interface in Java is a blueprint of a class. It is used to achieve abstraction and multiple inheritance.
// 100% abstraction 

// =use implement insted of extends
// = use interface  instid of class 
// ALL METHOD ARE PUBLIC ABSTRACTION AND WITHOUT IMPLIMENTATION 
// = final public and static variable in interface 