
public class Function6 {

// function without argument 
    public static void hellow() {
        System.out.println("Hello"); // Print "Hello" instead of an empty line
    }

    public static void numbercheck(int e) {
        e = 90;
        System.out.println(e);

    }

// swap function
    public static void swipno(int a, int b) {
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(" the value of a is" + a);
        System.out.println(" the value of a is" + b);
    }

// multiply of 2 no. 
    public static void multiply(int a, int b) {
        int mul = a * b;
        System.out.println(mul);

    }

// factorial of a number 
    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;
        }
        System.out.println("factorial of " + n + " is ;");
        return f;
    }
// bionomial function 

    public static int bio(int n, int r) {
        int nfact = fact(n);
        int rfact = fact(r);
        int nrfact = fact(n - r);
        int ncr = nfact / (rfact * nrfact);
        return ncr;
    }

    // mainm function 
    public static void main(String[] args) {
        hellow(); // Call the hellow method

// call swap function
        int a = 2;
        int b = 3;
        swipno(a, b);

        int e = 89;

        numbercheck(e);
        System.out.println(e);

//multiply of 2 number 
        multiply(a, b);

// factorial of a no.
        System.out.println(fact(5));
        int nf = fact(5);
        System.out.println(nf);

// boimolial cofficent 
        int ncr = bio(5, 2);
        System.out.println("the value of ncr is " + ncr);

    }
}
