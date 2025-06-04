// make node without functions 
// we dont want to shift data if we want to  enter the new data 
public class First2 {

    public static class node {

        int data;
        node next;

        public node(int data) {
            this.data =data;
            this.next = null;
        }

    }

    public static void main(String[] args) {
        node a = new node(1);
        node b = new node(2);
        node c = new node(3);
        node d = new node(4);
        node e = new node(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        System.out.println("Value of node a data "+a.data);
        System.out.println("addres of b"+a.next);
        System.out.println();




    }
}
