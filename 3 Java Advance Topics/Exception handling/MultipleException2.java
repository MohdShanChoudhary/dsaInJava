public class MultipleException2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int array[] = {1, 2, 3, 4, 5};

        try {
            int result = a / b;
            System.out.println(array[9]); // This will throw ArrayIndexOutOfBoundsException
        } catch (ArithmeticException abj) {
            System.out.println(abj);
            System.out.println("There is an arithmetic error.");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Array error: " + ex);
        }catch(Exception x){ // use fr all type of error 
System.out.println("somethong is wrong ");
        } finally {
            System.out.println("Final is always run.");
        }

        System.out.println("Successfully finished.");
    }
}






// public class MultipleException {
//     public static void main(String[] args) {
//         int a = 10;
//         int b = 0;
//         int array[] = {1, 2, 3, 4, 5};

//         try {
//             int result = a / b;
//         } catch (ArithmeticException abj) {
//             System.out.println(abj);
//             System.out.println("There is an arithmetic error.");
//         }

//         try {
//             System.out.println(array[9]);
//         } catch (ArrayIndexOutOfBoundsException ex) {
//             System.out.println("Array error: " + ex);
//         }

//         System.out.println("Successfully finished.");
//     }
// }
