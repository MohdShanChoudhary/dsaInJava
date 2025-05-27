// | Inheritance Type      | Supported in Java? | How?                                     |
// | --------------------- | ------------------ | ---------------------------------------- |
// | Single                | ✅                  | `class B extends A`                      |
// | Multilevel            | ✅                  | `class C extends B extends A`            |
// | Hierarchical          | ✅                  | `class B extends A`, `class C extends A` |
// | Multiple (Classes)    | ❌                  | Not supported                            |
// | Multiple (Interfaces) | ✅                  | `class D implements A, B`                |










// Multi level

// public class TypeOfInharitance6 {
//     public static void main(){
//              Puppy p = new Puppy();
//         p.eat();   // From Animal
//         p.bark();  // From Dog
//         p.weep();  // From Puppy
//     }
// }
// // Grandparent class
// class Animal {
//     void eat() {
//         System.out.println("Eating...");
//     }
// }

// // Parent class
// class Dog extends Animal {
//     void bark() {
//         System.out.println("Barking...");
//     }
// }

// // Child class
// class Puppy extends Dog {
//     void weep() {
//         System.out.println("Weeping...");
//     }
// }








// .......................................................................................................................
// Harical -> single parent and multiple child 
public class TypeOfInharitance6 {
    public static void main(){
            Dog d = new Dog();
        d.eat();
        d.bark();

        Cat c = new Cat();
        c.eat();
        c.meow();

        Cow cow = new Cow();
        cow.eat();
        cow.moo();
    
    }
}
// Superclass
class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Subclass 1
class Dog extends Animal {
    void bark() {
        System.out.println("Barking...");
    }
}

// Subclass 2
class Cat extends Animal {
    void meow() {
        System.out.println("Meowing...");
    }
}

// Subclass 3
class Cow extends Animal {
    void moo() {
        System.out.println("Mooing...");
    }
}





// ........................................................................................................................................
// hybrid inheritance - it is the combination of all class 


















//........................................................................................................................................
// multiple is not present in java 