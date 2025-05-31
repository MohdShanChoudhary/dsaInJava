public class reverseArray13 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7};
        int temp;
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            temp = array[end];
            array[end] = array[start];
            array[start] = temp;  
            start++;              
            end--;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
