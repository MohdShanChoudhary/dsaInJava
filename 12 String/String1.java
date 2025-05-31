// Think of a String as just a bunch of characters (letters, numbers, symbols) joined together to make words or sentences.
// String name = "Abhi";
// String sentence = "Java is fun!";
// String are immpuatble 
// 
import java.util.Scanner;
public class String1 {

    public static void main(String[] args) {
        String name = "mohammad shan ";
        String ok = new String("xyz");

        // array of type char 
        char Name[] = {'a', 'b'};
        System.out.println("enter the  name of employ ");
        Scanner cin = new Scanner(System.in);
        String employname = cin.next();       // it will only take a word 
        System.out.println(employname);
        // take imput a sentance 

         // consume the leftover newline from next()
        cin.nextLine();

        System.out.println("Enter  about employ ");
        String about=cin.nextLine(); // it will take whole line and santance 
        System.out.println(about);


        // find the length of a function 
        // using inbuld function strin.length()  it is different from the array.length which is is property of a array
        System.out.println("The length of string about is "+about.length() );




        // strinng concanation
        String fname="mohammad";
        String lname="krishna";
        String Fname=fname+" "+lname;
        System.out.println(Fname);


        

    }
}
