public class FirstRecursion{

// this is the function to print the no. in decrising order 
public static void printDec(int n){
if(n==1){
    System.out.println(1);
    return;
}
System.out.println(n);
printDec(n-1);                   // if we call function first then it will print no. in decrease order
}




public static void main(String[] args){
printDec(10);
}
}