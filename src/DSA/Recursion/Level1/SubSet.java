package DSA.Recursion.Level1;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3}; // Example array
/*        List<List<Integer>> subsets = generateSubsets(nums);

        // Print all subsets
        for (List<Integer> subset : subsets) {
            System.out.println(subset);
        }*/
        // Solve using the new backtracking method
        List<List<Integer>> subsets2 = generateSubsetsBacktracking(nums);
        System.out.println("Subsets using the backtracking method:");
        for (List<Integer> subset : subsets2) {
            System.out.println(subset);
        }
    }
    public static List<List<Integer>> generateSubsets(int[] nums) {
        return generateSubsetsHelper(nums, 0);
    }
    private static List<List<Integer>> generateSubsetsHelper(int[] nums, int index)
    {
        List<List<Integer>> allSubsets;

        // Base case: if we've considered all elements, return a list with an empty subset
        if (index == nums.length) {
            allSubsets = new ArrayList<>();
            allSubsets.add(new ArrayList<>());
            return allSubsets;
        }

        // Recursively generate all subsets for the remaining elements
        allSubsets = generateSubsetsHelper(nums, index + 1);

        // For each subset generated, create a new subset that includes the current element
        int currentElement = nums[index];
        int size = allSubsets.size();
        for (int i = 0; i < size; i++) {
            List<Integer> newSubset = new ArrayList<>(allSubsets.get(i));
            newSubset.add(currentElement);
            allSubsets.add(newSubset);
        }

        return allSubsets;
    }

    // New method using backtracking
    public static List<List<Integer>> generateSubsetsBacktracking(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, int start, List<Integer> currentSubset, List<List<Integer>> result) {
        // Add the current subset to the list of all subsets
        result.add(new ArrayList<>(currentSubset));

        // Explore further elements to generate all subsets
        for (int i = start; i < nums.length; i++) {
            // Include the current element in the subset
            currentSubset.add(nums[i]);

            // Recurse with the next element
            backtrack(nums, i + 1, currentSubset, result);

            // Backtrack by removing the last added element to explore other subsets
            currentSubset.remove(currentSubset.size() - 1);
        }
    }
}
