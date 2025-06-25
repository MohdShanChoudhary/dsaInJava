public class first {
    public static void main(String[] args){
        int a=10;
        int b=0;

// ArithmeticException – divide by 0

// NullPointerException – accessing null object

// ArrayIndexOutOfBoundsException – accessing invalid array index

// NumberFormatException – converting wrong format to number


try{
    int result=a/b;
System.out.println("Agar error nahi hogi to ya chalaga ");
}catch(ArithmeticException abj){   // also write excaptiona 

System.out.println(abj);
System.out.println("there is any error ");

}finally{
    System.out.println("This is always run ");
}


    }
}
