import java.util.*;
public class ForEach5 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Shan");
        names.add("Aman");
        names.add("Ravi");

        for (String name : names) {
            System.out.println(name);
        }
    }
}
