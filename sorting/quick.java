import java.util.Arrays;

public class quick {
    public static void main(String[] args) {
        int[] nums = {2, 3, 45, 78, 97, 4};

        // Call quicksort on the entire array
        sort(nums, 0, nums.length - 1);

        // Print the sorted array
        System.out.println(Arrays.toString(nums));
    }

    static void sort(int[] nums, int lo, int hi) {
        // Base case: if the subarray has 1 or no elements, return
        if (lo >= hi) {
            return;
        }

        // s = start pointer, e = end pointer
        int s = lo;
        int e = hi;

        // Find the middle index (to choose pivot)
        int m = s + (e - s) / 2;
        int pivot = nums[m]; // Pivot element

        // Partition step
        while (s <= e) {

            // Move s to the right while nums[s] is less than pivot
            while (nums[s] < pivot) {
                s++;
            }

            // Move e to the left while nums[e] is greater than pivot
            while (nums[e] > pivot) {
                e--;
            }

            // Swap elements if s <= e
            if (s <= e) {
                int temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
        }

        // Recursively sort the left half
        sort(nums, lo, e);

        // Recursively sort the right half
        sort(nums, s, hi);
    }
}
