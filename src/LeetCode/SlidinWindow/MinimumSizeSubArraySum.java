package LeetCode.SlidinWindow;

import java.util.HashSet;

public class MinimumSizeSubArraySum {
    public static void main(String[] args) {
//        System.out.println(minSubArrayLen(7,new int[]{2,3,1,2,4,3}));
        System.out.println(minSubArrayLen(11,new int[]{1,2,3,4,5}));
    }
    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int right = 0;
        int minLen = Integer.MAX_VALUE;
        int sum = 0;

        while (right < nums.length) {
            sum += nums[right];
            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= nums[left];
                left++;
            }
            right++;
        }

        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
