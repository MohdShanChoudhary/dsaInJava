
public class printLL3 {
// display using function 

    public static void print(node head) {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }

    }

    // display using recursion
    public static void displayr(node head ){
        if(head==null){
            System.out.println("empty");  // print null is option 
            return;
        }
        System.out.println(head.data);
        displayr(head.next);


    }

    // display reverse 
public static void displayreverce(node head) {
    if (head == null) {
        return;
    }
    displayreverce(head.next); 
    System.out.println(head.data);
}

        

// agar mujha nahi pata ke linklist ka size kiya hai to hum ya function use kranga
    public static void count(node head) {
        node temp = head;
        int c=0;
        while (temp != null) {
            c++;
            temp = temp.next;
            System.out.println(c);

        }

    }



    public static class node {

        int data;
        node next;

        node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        node a = new node(11);
        node b = new node(12);
        node c = new node(13);
        a.next = b;
        b.next = c;


        System.out.println("Print using function");
        print(a);
        System.out.println("Print using recursion ");
        displayr(a);
        System.out.println("print reverce");
        displayreverce(a);

        System.out.println("Print the lenght of  ");
        count(a);

    }

}
