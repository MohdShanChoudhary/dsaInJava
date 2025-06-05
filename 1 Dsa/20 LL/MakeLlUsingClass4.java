// | Method Name          | Purpose                            |
// | -------------------- | ---------------------------------- |
// | `size()`             | Print size of linked list          |
// | `add(int data)`      | Add node at end                    |
// | `addf(int data)`     | Add node at front                  |
// | `display()`          | Print linked list in normal order  |
// | `displayerReverse()` | Print linked list in reverse order |
// | `main()`             | Entry point for execution          |











public class MakeLlUsingClass4 {

    private node head;
    private node tail;
//node
    public class node {

        int data;
        node next;

        node(int data) {
            this.data = data;

        }
    }
    int size;
// display size 
    public void size() {
        System.out.println("The size of ll is " + size);

    }
// add element  at end 

    public void add(int data) {
    node newnode = new node(data);
    if (head == null) {
        head = tail = newnode;
    } else {
        tail.next = newnode;
        tail = newnode;
    }
    size++;
}

// add at front 
public void addf(int data){
    node newnode=new node(data);
    if(head==null){
        head=tail=newnode;
    }
    else{
        newnode.next=head;
        head=newnode;
size++;
    }
// normal display
}
   public void display() {
    node temp = head;
    if (head == null) {
        System.out.println("empty");
    } else {
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

// display reverse 
public void displayerReverse(node head){
    if(head == null) return;
    displayerReverse(head.next);
    System.out.println(head.data);
}



    public static void main(String[] args) {
        MakeLlUsingClass4 ll1 = new MakeLlUsingClass4();
        ll1.add(1);
        ll1.add(2);
        ll1.add(10);
        ll1.addf(0);
        ll1.display();
        System.out.println("Print reverce ");

  ll1.displayerReverse(ll1.head);
  ll1.size();


    }

}
