package LeetCode.Arrays;

import java.util.Arrays;

public class ArrayPartition1 {
    public static void main(String[] args) {
        System.out.println(arrayPairSum(new int[] {6,2,6,5,1,2}));
    }public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        int i = 0;
        int j=i+1; int sum = 0;
        while(j<=nums.length){
            if(nums[i]<=nums[j]){
                sum+=nums[i];
            }
            if(nums[j]<nums[i]){
                sum+=nums[j];
            }
            i=i+2;j=j+2;
        }
        return sum;
    }public static int arrayPairSum1(int[] nums) {

        int sum = 0;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i+=2) {
            sum += nums[i];
        }
        return sum;
    }
}
