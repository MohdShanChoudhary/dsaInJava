
import java.util.Scanner;

public class Array9 {

    public static void plus(int arr[]){
        for(int i=0 ; i<arr.length;i++){
            arr[i]=arr[i]+1;

        }
        System.out.println("print the array  using function with updated value ");
        for(int i=0 ; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {

        int namee[] = new int[23];
        int numberr[] = {1, 2, 3, 4, 5, 6, 7};

        int mark[] = new int[20];
        Scanner cin = new Scanner(System.in);
        System.out.println("enter the mark value ");
        mark[0] = cin.nextInt();
        mark[1] = cin.nextInt();
        mark[2] = cin.nextInt();
        mark[3] = cin.nextInt();
        mark[4] = cin.nextInt();
        mark[5] = cin.nextInt();
        System.out.println("The array is ");
        System.out.println(mark[0]);
        System.out.println(mark[1]);

        System.out.println(mark[2]);

        System.out.println(mark[3]);

        System.out.println(mark[4]);
       
        System.out.println(mark[5]);
         mark[0]=90;
         // we can also add and subtract or perform any arthemetic loogic operation 
         System.out.println(mark[0]);
        System.out.println(mark.length);

        // array always pass by reference 
        int fun[]={1,2,3};
        System.out.println("print with function ");
        plus(fun);
        System.out.println("print without function ");
        for(int i=0 ; i<fun.length;i++){
            System.out.println(fun[i]);
        }
        // pass a varibale is always without reference

    }
}
