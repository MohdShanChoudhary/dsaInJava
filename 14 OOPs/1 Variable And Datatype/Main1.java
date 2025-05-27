import java.util.Scanner;



public class Main1 {

    public static void main(String[] args) {

        // how  to print
        System.out.println("Hy Shan");
        System.out.print(" welcome to java ");

        // some variable 
        int age = 90;
        char gender = 'm';
        char word = 'a';
        word++;

        //  next line 
        System.out.println(word);
        System.out.println("a");
        System.out.println("a");
        System.out.print("a\nthis is use to print in nent line \n");
        System.out.print("a\n");

        // pattern in java using simple print 
        System.out.println("*****");
        System.out.println("****");
        System.out.println("***");
        System.out.println("**");
        System.out.println("*");



        //more varibale and litrals in java 
        //  identifire -> there are some word we can,t use them to name a variable 
        int m=23;
        int n=234;
        System.out.println(m+"and"+n);
        String wino="ko ko ko ";
        System.out.println(wino);
        char genderr='m';
        System.out.println("gender is "+genderr);
        m=n; // asigne the value of n to m
        System.out.println("now value of m is "+m);



        // more java data type 
        // int, char, boolean, double → primitive
        // String, int[] (array), user-defined class → non-primitive
            // int	10, -5, 200
            // float	3.14, -0.01
            // char	'A', 'z'
            // boolean	true, false
            // byte	127, -128               -- shorter than short 
            // short	32000                -- shorten  than int 
            // long	1234567890L              -- upgard form  of int 
            // double	3.14159265359        -- upgerd form  of float 
            //boolean < byte < short < char < int < float < long < double


        // input in java 
        System.out.print("Enter A NUMBER ");
        Scanner cin=new Scanner(System.in);    
        int shan=cin.nextInt();            // take int
        System.out.println(shan);
        // cin.nextInt()
        // cin.nextFloat()
        // cin.nextDouble()
        // cin.next()
        // cin.nextLine()
        // cin.nextBoolean()
        // cin.nextLong()
        // cin.nextShort()
        // cin.nextByte()
        // cin.nextLine()  -> input space also 

        cin.nextLine(); 
        System.out.println("enter you name ");
        String name;
        name=cin.nextLine();
        System.out.print(name);




        // sum of 2 number
        
        int a ;
        int b;
        System.out.print("Enter the value of a and b ");
        a=cin.nextInt();
        cin.nextLine(); 
        b=cin.nextInt();
        int sum=a+b;
        System.out.println(sum);
        



        // type conversion 
        // destination type > source type 
        //boolean < byte < short < char < int < float < long < double
        // # CODE 
        // int b=23;
        // long shan=352525;
        // b=shan;
        // System.out.println(b);     //->  it will give the error
        // we so dont take input in intger using next.float






        // type casting 
        System.out.println("Type Casting ");
        float number = 2.03f;
        int roundof = (int)number ;
        System.out.println(roundof);
        // ascai no. 
        char p='a';
        int r =(int)p;
        System.out.println(" the asscai value of a is ="+r);



        // type the permotion in  expretion 
        //byte → short → int → long → float → double

        // it is use when we perfrom the opeartion in two different tye of data type 
        byte aa = 10;
        int bb= 20;
        int result = aa + bb;  // 'a' is promoted to int
        System.out.println(result);  // Output: 30

        byte x = 5;
        byte y = 4;
        int z = x * y;  // Both bytes are promoted to int
        System.out.println(z);  // Output: 20


    }
}
