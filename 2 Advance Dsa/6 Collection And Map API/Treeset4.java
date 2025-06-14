// ✅ Stores unique elements
// ✅ Automatically keeps elements in sorted (ascending) order
// ✅ Is based on a Red-Black Tree (Self-balancing BST)
// storted set interface 


// | Method        | Description                           |
// | ------------- | ------------------------------------- |
// | `add(x)`      | Adds an element                       |
// | `remove(x)`   | Removes an element                    |
// | `contains(x)` | Checks if element exists              |
// | `first()`     | Returns the smallest element          |
// | `last()`      | Returns the largest element           |
// | `ceiling(x)`  | Smallest element ≥ x                  |
// | `floor(x)`    | Largest element ≤ x                   |
// | `higher(x)`   | Smallest element > x                  |
// | `lower(x)`    | Largest element < x                   |
// | `pollFirst()` | Removes and returns the first element |
// | `pollLast()`  | Removes and returns the last element  |



import java.util.*;


public class Treeset4{
    public static void main(String[] args) {
        TreeSet a=new TreeSet();
        TreeSet<String> set = new TreeSet<>();// this is right method 
        a.add(2);
        a.add(3);

        System.out.println(a);
    }

}


// Binary Tree
//    └── Binary Search Tree (BST)
//            ├── Unbalanced BST
//            └── Self-Balancing BST
//                    ├── AVL Tree
//                    ├── Red-Black Tree
//                    ├── Splay Tree
//                    └── Treap
