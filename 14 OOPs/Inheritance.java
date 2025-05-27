public class Inheritance {
    public static void main(String[] args) {
        Bike splendor = new Bike();
        splendor.name = "Splendor";
        System.out.println("Bike name is: " + splendor.name);
        splendor.size(2);
    }
}

class Vehicle {
    String name;

    void size(int n) {
        System.out.println("The size of Vehicle is " + n);
    }
}

class Bike extends Vehicle {
    
}

