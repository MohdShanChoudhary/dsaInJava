public class LargerINarray11 {
    public static void main(String[] args){
        int array[]={1,2,3,4,5,66,7};
        int max=array[1];

        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
System.out.println("The meximum element of array is "+max);





    }
}
