package LeetCode.BinarySearch;

public class SearchInsertPosition35 {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target= 7;
        System.out.println(searchInsert(arr,target));
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid=0;
        while(start<=end){
            mid = start+(end-start)/2;
            if(target == nums[mid]) return mid;
            if(target<nums[mid]){

                end = mid-1;
            }else {
                start = mid+1;
            }
            //else (target>nums[mid]){return nums.length+1;}
        }
        return start;
    }
}
