package LeetCode.Arrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateArray26 {
    public static void main(String[] args) {
        int[] nums = {1,1,2};
                //{10,9,9,0,8,6,5,4,2,1,0};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int insertIndex = 1;
        for(int i = 1; i < nums.length; i++){
            // We skip to next index if we see a duplicate element
            if(nums[i - 1] != nums[i]) {
                /* Storing the unique element at insertIndex index and incrementing
                   the insertIndex by 1 */
                nums[insertIndex] = nums[i];
                insertIndex++;
            }
        }
        return insertIndex;
    }
    public static int removeDuplicatesUsingSet(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int i: nums){
            s.add(i);
        }
        return s.size();
    }

}
