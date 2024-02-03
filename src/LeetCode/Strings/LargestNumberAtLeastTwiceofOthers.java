package LeetCode.Strings;

public class LargestNumberAtLeastTwiceofOthers {
    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[] {3,6,1,0}));
        System.out.println(dominantIndex(new int[] {1,2,3,4}));
    }
    public static int dominantIndex(int[] nums) {
        int left=0;
        int right= nums.length-1;
        int max=-1;
        int maxValInArray = Integer.MIN_VALUE;
        while(left<=right){
            if(nums[left]*2>=max){
                max = nums[left];
            }
            if(maxValInArray<=nums[left]){maxValInArray=nums[left];}
            left++;
            if(nums[right]*2>=max){
                max=nums[right];
            }
            if(maxValInArray<=nums[right]){maxValInArray=nums[right];}
            right--;
        }
        System.out.println(maxValInArray);
        return maxValInArray>2*max ?max : -1;
    }
}
