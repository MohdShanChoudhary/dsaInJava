public class LargestString5 {
    public static void main(String[] args)
    {


// | Return Value | Meaning                                 |
// | ------------ | --------------------------------------- |
// | `0`          | This object is **equal** to `other`     |
// | `< 0`        | This object is **less than** `other`    |
// | `> 0`        | This object is **greater than** `other` |



  
        String a = "apple";
        String b = "banana";

        int result = a.compareTo(b);

        System.out.println(result);  // negative value because "apple" < "banana"
    
      String fruitArray[] = {"apple", "banana", "mango", "orange"};

        String largest = fruitArray[0];

        for (int i = 1; i < fruitArray.length; i++) {
            if (fruitArray[i].compareTo(largest) > 0) {
                largest = fruitArray[i];
            }
        }

        System.out.println("The largest fruit is: " + largest);
        
    }
}
