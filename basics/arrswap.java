package basics;
import java.util.Arrays;

public class arrswap {
    public static void main(String[] args) {
        int[] arr = {20, 70, 80, 60};
        swap(arr, 0, 3);
        System.out.println(Arrays.toString(arr));  // Print array properly
    }

    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
