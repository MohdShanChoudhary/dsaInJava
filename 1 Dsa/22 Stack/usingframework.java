import java.util.*;

public class usingframework {
    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();

        // Check if the stack is empty
        System.out.println("Is stack empty? " + a.isEmpty());

        // Add elements
        a.push(10);
        a.push(20);

        // Now peek is safe
        if (!a.isEmpty()) {
            System.out.println("Top element: " + a.peek());
        }

        // Pop elements
        System.out.println("Popped: " + a.pop());
        System.out.println("Popped: " + a.pop());

        // Again check before peeking
        if (!a.isEmpty()) {
            System.out.println("Top element: " + a.peek());
        } else {
            System.out.println("Stack is empty, cannot peek.");
        }
    }
}
