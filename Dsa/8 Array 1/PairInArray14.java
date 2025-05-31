public class PairInArray14 {
    public static void pair(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + temp + ", " + arr[j] + ")");
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 3, 4, 5, 6, 7, 8, 9};
        pair(arr);
    }
}
