public class StringBuilder6 {
    public static void main(String[] args){
        StringBuilder sh= new StringBuilder("");
        for( char ch='a';ch<='z';ch++){
            sh.append(ch);
        }
System.out.println(sh);

    }
}
// ✅ Why Use StringBuilder Instead of String?
// String is immutable: once created, it cannot be changed.

// StringBuilder is mutable: you can change its content without creating a new object each time.

// Better performance when doing many appends, inserts, or deletions.

