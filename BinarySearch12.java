
public class BinarySearch12 {

    public static int binary(int array[], int key) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (array[mid] == key) {
                return mid;
            }
            if (array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] = {2, 3, 4, 5, 6, 7};
        int key = 5;

        int answer = binary(array, key);
        if (answer == -1) {
            System.out.println("Not found in array");
        } else {
            System.out.println("Element found at index: " + answer);
        }
    }
}
