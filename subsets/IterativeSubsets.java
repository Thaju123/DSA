import java.util.*;

public class IterativeSubsets {
     static List<List<Integer>> subsetdup(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        // Start with empty subset
        outer.add(new ArrayList<>());

            // For each number in the array
            for (int num : arr) {
                int size = outer.size();

                // Add num to each existing subset
                for (int i = 0; i < size; i++) {
                    List<Integer> inner = new ArrayList<>(outer.get(i));
                    inner.add(num);
                    outer.add(inner);
                }
            }
            return outer;
        }

    static List<List<Integer>> subset(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();

        // Start with empty subset
        outer.add(new ArrayList<>());

            // For each number in the array
            for (int num : arr) {
                int size = outer.size();

                // Add num to each existing subset
                for (int i = 0; i < size; i++) {
                    List<Integer> inner = new ArrayList<>(outer.get(i));
                    inner.add(num);
                    outer.add(inner);
                }
            }
            return outer;
        }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3}; // Example input
        List<List<Integer>> ans = subset(arr);

        System.out.println("All subsets:");
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
