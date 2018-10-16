import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[] {
            9, 7, 2, 4, 5, 3, 1, 8
        };
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    } 

    public static void sort(int[] arr) {
        for (int j = 1; j < arr.length; j++) {
            int k = arr[j];
            int i = j - 1;
            while(arr[i] > k && i > 0) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = k;
        }
    }
}