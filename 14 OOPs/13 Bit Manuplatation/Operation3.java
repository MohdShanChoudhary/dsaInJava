public class Operation3 {

    public static void getithbit(int n, int i) {
        int bitmask = 1 << i;
        if ((n & bitmask) == 0) {
            System.out.println("The " + i + "th bit is 0.");
        } else {
            System.out.println("The " + i + "th bit is 1.");
        }
    }

    public static void setithbit(int n, int i) {     // set 1 always in set bbit 
        int bitmask = 1 << i;
        System.out.println(n | bitmask);
    }
    
  public static void clearithbit(int n, int i) {  // swt 0 always set 0 
    int bitmask = ~(1 << i);
    System.out.println(n & bitmask);
}

    public static void main(String[] args) {
        getithbit(10, 2);
        setithbit(10, 2);
        clearithbit(10, 2);
    }
}
