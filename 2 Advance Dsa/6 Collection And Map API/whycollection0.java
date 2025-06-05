
// | 🔍 Reason                         | 💬 Description                                                                               |
// | --------------------------------- | -------------------------------------------------------------------------------------------- |
// | ✅ **Dynamic Size**                | Unlike arrays, collections like `ArrayList`, `HashSet`, etc. can grow or shrink in size.     |
// | ✅ **Built-in Methods**            | Collections provide ready-made methods like `add()`, `remove()`, `sort()`, `contains()` etc. |
// | ✅ **Type Safety with Generics**   | Collections can be type-safe using Generics (e.g., `List<String>`).                          |
// | ✅ **Different Data Structures**   | Use different types like `List`, `Set`, `Queue`, `Map` based on use case.                    |
// | ✅ **Efficient Searching/Sorting** | Collections have algorithms like binary search and sorting with `Collections.sort()` etc.    |
// | ✅ **Easy Iteration**              | Use enhanced for-loop, `Iterator`, or `forEach()` to easily loop through elements.           |

// follow non contigues memory allocation 
// inbuld function 
// store both homo and hetrogeious 
// dinimic in nature 
// relese in 1.2 verrsion 
// data store in object 
// 

// this is array list 
import java.util.ArrayList;
public class whycollection0 {
    public static void main(String[] args){
        
        ArrayList A1=new ArrayList();                       // i can add any type of data in it     
        ArrayList<Integer> A2=new ArrayList<>();             // this is array deque 
        A1.add(1);
        A1.add(2);
        A2.add(3);
        A2.add(4);
        A1.add(0,56);
        System.out.println(A1);
        System.out.println(A2);
        A1.addAll(A2);
        System.out.println(A1);
    }
}
