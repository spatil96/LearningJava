package LeetCode.Strings;

import java.sql.Array;
import java.util.Arrays;

public class PivotIndex {
    
    public static void main(String[] args) {
        // Example usage:
        PivotIndex solution = new PivotIndex();
        int[] nums1 = {2, 3, -1, 8, 4};
        System.out.println(solution.findMiddleIndex(nums1)); // Output: 3

        int[] nums2 = {1, -1, 4};
//        System.out.println(solution.findMiddleIndex(nums2)); // Output: 2

        int[] nums3 = {2, 5};
//        System.out.println(solution.findMiddleIndex(nums3)); // Output: -1
    }
    public int findMiddleIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            totalSum -= nums[i];

            if (leftSum == totalSum) {
                return i;
            }

            leftSum += nums[i];
        }

        return -1;
    }
}


              // Step 1: Initialize prefix sum array

