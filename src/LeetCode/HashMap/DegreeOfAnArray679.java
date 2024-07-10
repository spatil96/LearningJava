package LeetCode.HashMap;
import java.util.*;
public class DegreeOfAnArray679 {
    public static void main(String[] args) {
        System.out.println(findShortestSubArray(new int[]{1,2,2,3,4,1}));
    }
    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> nums_counts = new HashMap();
        HashMap<Integer, Integer> first_seen = new HashMap();
        int degree = 0;
        int minLength = 0;
        for(int i = 0; i<nums.length;i++){
            first_seen.putIfAbsent(nums[i], i);
            nums_counts.put(nums[i], nums_counts.getOrDefault(nums[i],0)+1);
            if(nums_counts.get(nums[i])>degree){
                degree = nums_counts.get(nums[i]);
                minLength = i-first_seen.get(nums[i])+1;
            }else if(nums_counts.get(nums[i])==degree){
                minLength =Math.min(minLength, i-first_seen.get(nums[i])+1);
                System.out.println("MIn");
            }
        }
        return minLength;
    }
}
