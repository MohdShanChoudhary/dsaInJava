public class usingll2 {

    public class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public node head;
    public node tail;

    public void enqueue(int data) { 
        node newNode = new node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void dequeue() { 
        if (head == null) {
            System.out.println("System is empty ");
        } else {
            head = head.next;
        }
    }

    public void peek() { 
        if (head == null) { 
            System.out.println("List is empty");
        } else {
            System.out.println(head.data);
        }
    }

    public int isempty(node head) { 
        return (head == null) ? 1 : 0;
    }

    public void size() {
        node temp = head;
        int n = 0;

       
        while (temp != null) {
            temp = temp.next;
            n++;
        }

        System.out.println("The size of LL is " + n);
    }

    public void diplay() {
        
        node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null"); 
    }

    public static void main(String[] args) {
        usingll2 list = new usingll2();

        list.enqueue(10);
        list.enqueue(20);
        list.enqueue(30);

        list.diplay();
        list.peek();
        list.size();
        list.dequeue();
        list.diplay();
    }
}
