public class Static9 {

    static int count = 0;  // static variable shared by all objects

    Static9() {  // constructor name same as class
        count++;  // increments shared count whenever an object is created
    }

    static void displayCount() {  // static method to access static variable
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        Static9 obj1 = new Static9();
        Static9 obj2 = new Static9();
        Static9 obj3 = new Static9();

        Static9.displayCount();  // Calling static method without creating object
    }
}
