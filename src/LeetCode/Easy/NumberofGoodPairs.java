package LeetCode.Easy;

import java.util.HashMap;
import java.util.Map;

/*Given an array of integers nums, return the number of good pairs.

A pair (i, j) is called good if nums[i] == nums[j] and i < j.



Example 1:

Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
Example 2:

Input: nums = [1,1,1,1]
Output: 6
Explanation: Each pair in the array are good.
Example 3:

Input: nums = [1,2,3]
Output: 0

 */
public class NumberofGoodPairs {
    public static void main(String[] args) {
        int []arr = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(arr));
    }
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        Map<Integer, Integer> frequency = new HashMap<>();

        for (int num : nums) {
            int freq = frequency.getOrDefault(num, 0);
            count += freq; // Increase the count by the frequency of the current number
            frequency.put(num, freq + 1); // Update the frequency of the current number
        }

        return count;
    }
}
