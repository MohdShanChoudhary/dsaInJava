public class throws4 {

    // Method to divide two numbers and declare it may throw ArithmeticException
    static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        try {
            int result = divide(10, 0);  // Change 2 to 0 to test exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("❌ Cannot divide by zero!");
        }
    }
}
