public class constructor4 {

    public static void main(String[] args) {
        Student shan = new Student("Mohammad Shan");
        Student shan1 = new Student(50);    // Constructor Overloading (Example of Polymorphism)

        // Copy Constructor
        Student1 s1 = new Student1("Mohd Shan", 21);
        Student1 s2 = new Student1(s1);  // Copy constructor is called

        System.out.println("Copied Student:");
        System.out.println("Name: " + s2.name);
        System.out.println("Age: " + s2.age);
    }
}

class Student {
    int age;
    String name;

    // Parameterized Constructor
    Student(String name) {
        this.name = name;
        System.out.println("Student name is: " + name);
    }

    // Overloaded Constructor
    Student(int age) {
        this.age = age;
        System.out.println("Student age is: " + age);
    }
}

class Student1 {
    String name;
    int age;

    // Parameterized Constructor
    Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ✅ Copy Constructor (Fix: Accepts Student1, not Student)
    Student1(Student1 s) {
        this.name = s.name;
        this.age = s.age;
    }
}
