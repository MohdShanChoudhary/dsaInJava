public class stackusingll2 {

    public static class LL {
        public static class Node {
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public static class Stack {
            static Node head = null;

            // isEmpty
            public static boolean isEmpty() {
                return head == null;
            }

            // push
            public static void push(int data) {
                Node newNode = new Node(data);
                newNode.next = head;
                head = newNode;
            }

            // pop
            public static void pop() {
                if (isEmpty()) {
                    System.out.println("Stack is already empty.");
                } else {
                    System.out.println("Popped: " + head.data);
                    head = head.next;
                }
            }

            // peek
            public static void peek() {
                if (isEmpty()) {
                    System.out.println("Stack is empty.");
                } else {
                    System.out.println("Top: " + head.data);
                }
            }
        }
    }

    public static void main(String[] args) {
        LL.Stack.push(10);
        LL.Stack.push(20);
        LL.Stack.peek();     // Should print 20
        LL.Stack.pop();      // Should remove 20
        LL.Stack.peek();     // Should print 10
        LL.Stack.pop();      // Should remove 10
        LL.Stack.pop();      // Should say stack is empty
    }
}
