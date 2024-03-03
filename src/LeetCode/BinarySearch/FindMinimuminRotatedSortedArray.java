package LeetCode.BinarySearch;

public class FindMinimuminRotatedSortedArray {
    public static void main(String[] args) {
        System.out.println(findMin(new int[]{}));
    }
    // public int findMin(int[] nums) {
    //     Arrays.sort(nums);
    //     return nums[0];
    // }
    public static int findMin(int[] num) {
        int left =0;
        int right = num.length-1;
        while(left<=right){
            if(num[left]<=num[right]){
                return num[left];
            }
            int mid= (left+right)/2;
            if(num[mid]>=num[left]){
                left=mid+1;
            }
            else{
                right=mid;
            }
        }
        return 0;
    }
}
