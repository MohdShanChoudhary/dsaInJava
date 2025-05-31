
public class Pattern5 {

    public static void main(String[] args) {
        System.out.println("Code  is running ?");

// right angle triangle 
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

//inverted right angle triangle 
        for (int j = 0; j < 5; j++) {
            for (int k = 5; k > j; k--) {
                System.out.print("8");
            }
              System.out.println(); 
        }



//inverted right angle triangle of number 

           for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }


//inverted right angle triangle of char
        char ch='a';
         for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }


    }
}
