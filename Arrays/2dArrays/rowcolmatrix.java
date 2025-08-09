import java.util.Arrays;

public class rowcolmatrix {
    public static void main(String[] args) {
        int[][] arr = {
           {1, 2, 3, 4},
    {5, 6, 7, 8},
    {9, 10, 11, 12}
        };
        int[] ans = search(arr, 7); // Replace 0 with the target you want
        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int[][] arr, int target) {
        int r = 0;
        int c = arr.length - 1; // start from top-right

        while (r < arr.length && c >= 0) {
            if (arr[r][c] == target) {
                return new int[] {r, c};
            }
            if (arr[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }

        return new int[] {-1, -1}; // not found
    }
}
