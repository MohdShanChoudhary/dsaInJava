class ShallowAndDepp {  // Class name is ShallowAndDepp
    String name;
    int[] marks;

    // Constructor
    ShallowAndDepp(String name, int[] marks) {  // Constructor name changed to match class
        this.name = name;
        this.marks = marks;
    }

    // Shallow Copy Constructor
    ShallowAndDepp(ShallowAndDepp s) {  // Constructor name changed to match class
        this.name = s.name;
        this.marks = s.marks;  // Reference copied, NOT the array itself
    }
}

class StudentDeepCopy {
    String name;
    int[] marks;

    // Constructor
    StudentDeepCopy(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Deep Copy Constructor
    StudentDeepCopy(StudentDeepCopy s) {
        this.name = s.name;
        this.marks = new int[s.marks.length];
        for (int i = 0; i < s.marks.length; i++) {
            this.marks[i] = s.marks[i];  // Actual array copied
        }
    }
}

public class Main {
    public static void main(String[] args) {
        int[] marks = {90, 80, 70};
        
        // Shallow copy example
        ShallowAndDepp s1 = new ShallowAndDepp("Alice", marks);
        ShallowAndDepp s2 = new ShallowAndDepp(s1);
        
        s2.marks[0] = 100;  // Changing s2 marks
        
        System.out.println("Shallow Copy:");
        System.out.println("s1 marks[0]: " + s1.marks[0]);  // Output: 100 (changed!)
        System.out.println("s2 marks[0]: " + s2.marks[0]);  // Output: 100
        
        // Deep copy example
        StudentDeepCopy sd1 = new StudentDeepCopy("Bob", marks);
        StudentDeepCopy sd2 = new StudentDeepCopy(sd1);
        
        sd2.marks[0] = 50;  // Changing sd2 marks
        
        System.out.println("\nDeep Copy:");
        System.out.println("sd1 marks[0]: " + sd1.marks[0]);  // Output: 100 (unchanged)
        System.out.println("sd2 marks[0]: " + sd2.marks[0]);  // Output: 50
    }
}
