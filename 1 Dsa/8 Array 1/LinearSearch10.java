
public class LinearSearch10 {

    public static int searc(int arrar[], int num) {
        for (int i = 0; i < arrar.length; i++) {
            if(arrar[i]==num){
                return i;
            }
           
        } return -1;
    }

    public static void main(String[] args) {

        int array[] = {1, 2, 3, 4, 5, 6};
        int find = 5;
         int result=searc(array,find);
         if(result==-1){
            System.out.println("not found in array ");
         }
         else{
         System.out.println("Index is "+result);
         }

    }
}
