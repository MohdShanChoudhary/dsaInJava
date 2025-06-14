import java.util.*;

public class HashMapTreeMapExample {
    public static void main(String[] args) {
        // Hashtable using raw type
        Hashtable ht = new Hashtable();
        ht.put("Apple", 100);
        ht.put("Banana", 60);
        ht.put("Mango", 90);

        // putIfAbsent with same type (String key)
        ht.putIfAbsent("Orange", 50);  // Corrected type and added ;

        System.out.println("Hashtable: " + ht);

        // TreeMap using raw type
        TreeMap tm = new TreeMap();
        tm.put("Banana", 60);
        tm.put("Apple", 100);
        tm.put("Mango", 90);

        System.out.println("TreeMap: " + tm);
    }
}
