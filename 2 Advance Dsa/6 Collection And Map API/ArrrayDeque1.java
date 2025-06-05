// | Feature     | **ArrayList**                           | **ArrayDeque**                             |
// | ----------- | --------------------------------------- | ------------------------------------------ |
// | Used for    | Storing elements in order (like a list) | Double-ended queue (Deque – Queue & Stack) |
// | Access type | Random access                           | FIFO (Queue) / LIFO (Stack) operations     |
import java.util.*;


// this is array deque - it act like a stact and queue also 
// index bacwe acces not allow 
// it follow qouble endid quiue 
// add any tyoe of data 
// do not add in midel of it 
public class ArrrayDeque1 {
    public static void main(String[] args ){
        ArrayDeque a=new ArrayDeque();
        ArrayDeque <Integer> b=new ArrayDeque<>();
        a.add(1);
        a.addFirst(0);
        a.addLast(9);
        System.out.println(a);
        a.offer(111);                   //    make rejection and acception of insertion 

        a.offerFirst(90);                        // offer is also act as  like as 
                System.out.println(a);


    }
    
}
