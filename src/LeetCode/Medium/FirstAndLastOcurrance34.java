package LeetCode.Medium;

import java.util.Arrays;

public class FirstAndLastOcurrance34 {
    public static void main(String[] args) {
        int[] letters = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(letters, target)));

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        if(nums.length==0){
            return ans;
        }
        ans[0] = search(nums, target, 1);
        ans[1] = search(nums, target, 0);
        return ans;
    }
    public static int search(int[] nums, int target, int searchType){
        int ans =-1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            //if(target == nums[mid]){ ans[0]=mid; return ans;}
            if(target<nums[mid]){
                end = mid-1;
            }else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                ans=mid;
                if(searchType == 1){
                    end=mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
