import java.util.*;
public class ScannerExample3 {
    public static void main(String[] args){

        int numbe=0;
        Scanner cin = new Scanner(System.in);
        System.out.println("Enter a noumner not a string");
        try{

        numbe = cin.nextInt();
       }
        
        catch(InputMismatchException a){
            System.out.println("Enter  number oly ");
        }finally{
             cin.close();
        }
        System.out.println(numbe);
    }
}
