// | Feature   | `length` (Array)   | `length()` (String)  |
// | --------- | ------------------ | -------------------- |
// | Used with | Arrays             | Strings              |
// | Type      | Property (field)   | Method               |
// | Syntax    | `array.length`     | `string.length()`    |
// | Returns   | Number of elements | Number of characters |



    public class LengthExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array length: " + numbers.length);

        String text = "Hello Java";
        System.out.println("String length: " + text.length());
    }
}


