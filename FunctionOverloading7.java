public class FunctionOverloading7 {

    public static int value(int n, int m, int z) {
        System.out.println("the product of 3 number is ");
        return n * m * z;
    }

    public static int value(int n, int m) {
        System.out.println("the  sum of 2 no. is");
        return n + m;
    }

    public static void primre(int n) {
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is NOT a prime number.");
        }
    }




// optimized method 
public static void primreop(int n) {
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        

        if (isPrime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is NOT a prime number.");
        }
    }

    public static void main(String[] args) {
        System.out.println(value(2, 5, 2));
        System.out.println(value(2, 3));
        primre(2);
        primreop(2);
    }
}
