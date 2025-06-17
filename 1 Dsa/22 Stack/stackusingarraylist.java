import java.util.ArrayList;

public class stackusingarraylist {

    public static class stack {

        static ArrayList<Integer> stack = new ArrayList<>();

        // check is empty 
        public static void isempty() {
            if (stack.size() == 0) {
                System.out.println("Stack is empty");
            }
        }

        // push 
        public static void push(int data) {
            stack.add(data);
        }

        // peek 
        public static void peek() {
            if (stack.size() == 0) {
                System.out.println("Stack is already empty");
            } else {
                System.out.println(stack.get(stack.size() - 1));
            }
        }

        // pop 
        public static void pop() {
            if (stack.size() == 0) {
                System.out.println("Stack is already empty");
            } else {
                stack.remove(stack.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        stack.isempty();   // should say empty
        stack.push(10);
        stack.push(20);
        stack.peek();      // should print 20
        stack.pop();
        stack.peek();      // should print 10
    }
}
