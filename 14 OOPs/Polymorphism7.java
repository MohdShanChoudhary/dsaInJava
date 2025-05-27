


// compile type  ->static ->method overloading 
// multiple function with same name and different paremeter 

public class Polymorphism7 {
 public static void main (String[] args)
{


Calculator calc = new Calculator();

        System.out.println(calc.add(5, 10));         
        System.out.println(calc.add(5, 10, 15));     
        System.out.println(calc.add(5.5, 10.5));    
 }   
}
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }


    double add(double a, double b) {
        return a + b;
    }
}





// run type ->dynamic -> function overrding 
// 
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    void sound() {
        System.out.println("Dog barks");
    }
}

