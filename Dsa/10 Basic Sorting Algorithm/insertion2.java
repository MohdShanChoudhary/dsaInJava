import java.util.Scanner;

public class insertion2 {

    public static void insertion(int[] arr) {
        
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size = cin.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements in array:");
        for (int i = 0; i < size; i++) {
            array[i] = cin.nextInt();
        }

        insertion(array);

        System.out.println("Sorted array:");
        for (int i=0;i<size;i++) {
            System.out.print(array[i] );
        }

        
    }
}
