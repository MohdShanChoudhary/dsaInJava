// | Method Name          | Purpose                            |
// | -------------------- | ---------------------------------- |
// | `size()`             | Print size of linked list          |
// | `add(int data)`      | Add node at end                    |
// | `addf(int data)`     | Add node at front                  |
// | `display()`          | Print linked list in normal order  |
// | `displayerReverse()` | Print linked list in reverse order |
// | `main()`             | Entry point for execution          |



// | Function Name            | Purpose                         |
// | ------------------------ | ------------------------------- |
// | `addAt(int index, data)` | Add at a specific index         |
// | `remove()`               | Remove the last element         |
// | `removeFirst()`          | Remove the first element        |
// | `removeAt(int index)`    | Remove element at a given index |
// | `get(int index)`         | Get element at a specific index |
// | `search(int data)`       | Search for a value              |
// | `reverseIterative()`     | Reverse the list using a loop   |
// | `clear()`                | Clear the entire list           | 







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
// add at index 
// Add element at specific index
public void addindex(int index, int data) {
    if (index < 0 || index > size) {
        System.out.println("Please enter a valid index");
        return;
    }

    if (index == 0) {
        addf(data);
        return;
    }

    if (index == size) {
        add(data);
        return;
    }

    node newnode = new node(data);
    node temp = head;
    
    // Traverse t   o node just before the insertion point
    for (int i = 0; i < index - 1; i++) {
        temp = temp.next;
    }

    newnode.next = temp.next;
    temp.next = newnode;
    size++;
}

public void removel() {
    if (head == null) {
        System.out.println("List is already empty");
        return;
    }

    if (head.next == null) {
        // Only one element
        head = tail = null;
        size = 0;
        return;
    }

    // More than one element
    node temp = head;
    for (int i = 0; i < size - 2; i++) {
        temp = temp.next;
    }

    temp.next = null;
    tail = temp;
    size--;
}

// display reverse 
public void displayerReverse(node head){
    if(head == null) return;
    displayerReverse(head.next);
    System.out.println(head.data);
}


// Remove the first element
public void removef() {
    if (head == null) {
        System.out.println("Already empty");
        return;
    }

    head = head.next; // Move head to next node
    size--;

    // If list becomes empty after removal
    if (head == null) {
        tail = null;
    }
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
