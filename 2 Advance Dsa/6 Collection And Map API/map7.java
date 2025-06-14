

// 🔷 Important Features of Map:
// Feature	Description
// Unique Keys	Keys must be unique
// Duplicate Values	Values can be duplicated
// Key-Value Structure	Each key maps to one value
// Fast Lookup	Get value using map.get(key)
// Not a Collection	Map is not a child of the Collection interface


// type -HashMap	LinkedHashMap	TreeMap	Hashtable
// // chat gtp versio
// import java.util.*;
// public class map7 {


//     public static void main(String[] args) {
//         Map<String, Integer> marks = new HashMap<>();
//         marks.put("Shan", 90);
//         marks.put("Ravi", 85);
//         marks.put("Aman", 78);

//         System.out.println("Marks of Shan: " + marks.get("Shan"));

        
//     }
// }



import java.util.*;


class map7{
    public static  void main(String[] args ){
        HashMap a1=new HashMap();//❌ No order maintained
        a1.put(null,null);// we can  enter or store null
        a1.put(01,"choudhary");
        System.out.println(a1);




        LinkedHashMap a2=new LinkedHashMap();//✅ Maintains insertion order
        a2.put("shan","shan");
                a2.put("ok","shan");
                        a2.put(1,"shan");


        System.out.println(a2);

    }
}