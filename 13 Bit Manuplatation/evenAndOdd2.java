public class evenAndOdd2 {
    public static void check(int n ){

        int bitmask=1;
        if((n&bitmask)==0){
            System.out.println("Number is even ");
        }
        else{
            System.out.println("Number is odd");
        }

        
    }
    public static void main(String[] args){
check(5);
    

    }
}
