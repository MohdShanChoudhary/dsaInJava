
import java.util.Scanner;

public class loop4 {

    public static void main(String[] args) {
        // whilw loop 
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        // Print n number 
        System.out.println("print the n number ");
        int j = 0;
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        while (j < n) {
            System.out.println(j);
            j++;

        }    // sum of first natural no 
        // n = 1 2 3
        int numm = 5;
        int k = 1;
        int sum = 0;

        System.out.println("Print the sum of first " + numm + " numbers:");

        while (k <= numm) {
            sum = sum + k;
            System.out.println(sum);
            k++;
        }

        // for loop 
        for (int z = 0; z < 4; z++) {
            System.out.println("****");
        }
        //Print reverse of a number 

        System.out.println("Print reverse of a number");
        int mo = 10899;
        while (mo > 0) {
            int ls = mo % 10;
            System.out.print(ls + " ");
            mo = mo / 10;

        }

        // reverse no. not print 
        System.out.println("Reverse or a no. and save in a");
        int ll = 10899;
        int rev = 0;

        while (ll > 0) {
            int ld = ll % 10;
            rev = rev * 10 + ld;
            ll = ll / 10;
        }

        // do while loop 
        // atleast run 1 time 
        int d = 0;
        do {
            System.out.println("shan is grate ");
            d++;
        } while (d < 10);

        // break statement
        do {
            System.out.println("Enter a number ");
            int ml = cin.nextInt();
            if (ml % 10 == 0) {
                break;
            }

            System.out.println("number was:" + ml);
        } while (true);

        //    do{
        //     System.out.println("Enter a number ");
        //     int lm=cin.nextInt();
        //     if(lm%10==0){
        //         continue;
        //     }
        //     System.out.println("No was:"+lm);
        //    }while(true);




        // prime or not 
        // 2 3 5 7   
        boolean isPrime = true; // Corrected variable name and casing
        int number = 7; // Corrected variable name
        for (int ii = 2; ii < number; ii++) { // Changed 'i' to 'ii'
            if (number % ii == 0) {
                isPrime = false; // Corrected variable name and casing
                break; // Optional: break the loop if a divisor is found
            }
        }
        if (isPrime) { // Simplified condition
            System.out.println("The number is prime."); // Corrected output message
        } else {
            System.out.println("The number is not prime."); // Corrected output message
        }

    }
}
