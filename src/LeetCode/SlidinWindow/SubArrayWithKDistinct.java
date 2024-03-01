package LeetCode.SlidinWindow;

import java.util.HashSet;

public class SubArrayWithKDistinct {
    public static void main(String[] args) {

    }
    //my solution
    public static int subarraysWithKDistinct(int[] nums, int k) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            HashSet<Integer> set = new HashSet<>();
            for (int j = i; j < nums.length; j++) {
                set.add(nums[j]);
                if (set.size() == k) {
                    res++;
                }
                if (set.size() > k) {
                    break;
                }
            }
        }
        return res;
    }
    public static int subarraysWithKDistinctLC(int[] nums, int k) {
        return helper(nums,k)-helper(nums,k-1);
    }
    public static int helper(int[] nums,int k){
        int l=0,r=0,res=0,ct=0;
        int[] log=new int[nums.length+1];
        while(r<nums.length){
            log[nums[r]]++;
            if(log[nums[r]]==1) ct++;
            while(ct>k){
                 log[nums[l]]--;
                if(log[nums[l]]==0) ct--;
                l++;
            }
            res+=(r-l+1);
            r++;
        }
        return  res;
    }
}
