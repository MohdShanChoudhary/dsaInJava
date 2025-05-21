
public class Operator2 {
    public static void main(String[] args) {
// | No. | Operator Type            | Description                              |
// | --- | ------------------------ | ---------------------------------------- |
// | 1   | **Arithmetic Operators** | Perform basic math operations            |
// | 2   | **Relational Operators** | Compare values (return true/false)       |
// | 3   | **Logical Operators**    | Combine multiple conditions (true/false) logical and ,or, not |
// | 4   | **Assignment Operators** | Assign values to variables               |
// | 5   | **Unary Operators**      | Work with a single operand /increment &d |
// | 6   | **Bitwise Operators**    | Work on bits (binary level)              |
// | 7   | **Ternary Operator**     | Shorthand for `if-else`                  |
// | 8   | **Shift Operators**      | Shift bits left or right                 |
// | 9   | **Instanceof Operator**  | Checks object type                       |
// | 10  | **Type Cast Operator**   | Converts data type                       |
       



  // 1. Arithmetic Operators
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // 2. Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // 3. Logical Operators
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y: " + (x && y));
        System.out.println("x || y: " + (x || y));
        System.out.println("!x: " + (!x));

        // 4. Assignment Operators
        int c = 5;
        System.out.println("\nAssignment Operators:");
        c += 2;
        System.out.println("c += 2: " + c);
        c -= 1;
        System.out.println("c -= 1: " + c);
        c *= 3;
        System.out.println("c *= 3: " + c);
        c /= 2;
        System.out.println("c /= 2: " + c);
        c %= 4;
        System.out.println("c %= 4: " + c);

        // 5. Unary Operators
        int d = 5;
        System.out.println("\nUnary Operators:");
        System.out.println("d = " + d);
        System.out.println("++d = " + (++d));
        System.out.println("--d = " + (--d));
        System.out.println("-d = " + (-d));
        System.out.println("+d = " + (+d));

        // 6. Bitwise Operators
        int p = 5, q = 3;
        System.out.println("\nBitwise Operators:");
        System.out.println("p & q = " + (p & q));
        System.out.println("p | q = " + (p | q));
        System.out.println("p ^ q = " + (p ^ q));
        System.out.println("~p = " + (~p));

        // 7. Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("\nTernary Operator:");
        System.out.println("Max of a and b is: " + max);
        //condition ? value_if_true : value_if_false;



        // 8. Shift Operators
        int num = 8;
        System.out.println("\nShift Operators:");
        System.out.println("num << 1: " + (num << 1));  // 8 * 2 = 16
        System.out.println("num >> 1: " + (num >> 1));  // 8 / 2 = 4
        System.out.println("num >>> 1: " + (num >>> 1)); // same as >> for positive numbers

        // 9. instanceof Operator
        String str = "Hello";
        System.out.println("\ninstanceof Operator:");
        System.out.println("str instanceof String: " + (str instanceof String));

        // 10. Type Cast Operator
        double dNum = 9.78;
        int iNum = (int) dNum;
        System.out.println("\nType Cast Operator:");
        System.out.println("double to int: " + iNum);
    }
}
    