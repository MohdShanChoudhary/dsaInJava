
import java.util.Scanner;

public class ConditionalStatement3 {

    public static void main(String[] args) {
        int age = 15;

        if (age > 18) {
            System.out.println("You can come in bar ");
        }

        // Check if the person is a teenager
        if (age >= 13 && age <= 19) {
            System.out.println("You are a teen ager ");
        } else {
            System.out.println("You can't come inside ");

        }

        // print the largest of 2 number
        int a = 3;
        int b = 2;
        if (a > b) {
            System.out.println("Thed grater no, is " + a);

        } else {
            System.out.println("grater no. is " + b);
        }

        //odd or even 
        // 1 id odd and 4 id even 
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = cin.nextInt();
        if (num % 2 == 0) {
            System.out.println("IT is a even no.");
        } else {
            System.out.println("It is a odd no.");
        }

        // else if   -  agar if true ho gai to else wali check nahi hogi 
        // grataer in 3 number 
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        if (num1 >= num2 && num1 >= num3) {
            System.out.println("num 1 is grater ");

        }
        if (num2 >= num3) {
            System.out.println("num 2 is grater");
        } else {
            System.out.println("num 3 is grater ");
        }

        //tranary operater 
        System.out.println("Ternary operater ");
        //condition ? value_if_true : value_if_false;
        String shanage = (age == 18) ? "adult" : "teenager";
        System.out.println(shanage);

        // pass or not
        int mark = 34;
        String report = (mark <= 33) ? "fail" : "Pass";
        System.out.println("You are " + report);




        // Switch statement 
        // if 1 case have right condition then all cases will run 
        int okk=2;
        switch(okk){
            case 1:System.out.println("1 is selected");
            case 2:System.out.println("2 is selected");
            default:System.out.println("we use defaault now");         // it run all the time 

        }



        int okkk=2;
        switch(okkk){
            case 1:System.out.println("1 is selected");
            break;
            case 2:System.out.println("2 is selected");
            break;
            default:System.out.println("we use defaault now");         // not run all the time bcz we use break statement 

        }






        // CALCULATER IN  JAVB
        //  Scanner sc = new Scanner(System.in);

        // System.out.print("Enter first number: ");
        // double num1 = sc.nextDouble();

        // System.out.print("Enter second number: ");
        // double num2 = sc.nextDouble();

        // System.out.print("Enter operator (+, -, *, /): ");
        // char operator = sc.next().charAt(0);

        // double result;

        // switch (operator) {
        //     case '+':
        //         result = num1 + num2;
        //         System.out.println("Result = " + result);
        //         break;
        //     case '-':
        //         result = num1 - num2;
        //         System.out.println("Result = " + result);
        //         break;
        //     case '*':
        //         result = num1 * num2;
        //         System.out.println("Result = " + result);
        //         break;
        //     case '/':
        //         if (num2 != 0) {
        //             result = num1 / num2;
        //             System.out.println("Result = " + result);
        //         } else {
        //             System.out.println("Error: Division by zero!");
        //         }
        //         break;
        //     default:
        //         System.out.println("Invalid operator!");
        // }






        


    }
}
