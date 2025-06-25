

import java.util.*;
// it impliment queue interface  and internally follow min heap 
// not insert at a spisific order (order of insertion is not priserve )
// follow min heap 
// allow dublicate 
// only one type data 

public class PriorityQueue3 {
    public static void main(String[] args){
        PriorityQueue a=new PriorityQueue();
        PriorityQueue<Integer> b=new PriorityQueue<>();
        a.add(1);
         a.add(12);
        
         a.add(13);
        
         a.add(133);
         a.add(14);
         a.add(15);
         a.add(16);
         System.out.println(a);
        


    }
}
