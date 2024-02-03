package LeetCode.Arrays101;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
//        moveZeroes(new int[] {0,1,0,3,12});
        moveZeroesSwap(new int[] {0,1,0,3,12});
    }
    //using Swap and inplace
    public static void moveZeroesSwap(int[] nums) {
        int writePointer = 0;

        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != 0) {
                // Swap non-zero element with the element at writePointer
                int temp = nums[writePointer];
                nums[writePointer] = nums[readPointer];
                nums[readPointer] = temp;

                writePointer++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    //Using Two Loops and two pointers
    public static void moveZeroes(int[] nums) {

        int writePointer = 0;
        int count=0;
        for (int readPointer = 0; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != 0) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
                System.out.println(Arrays.toString(nums));
            }else{count++;}
        }
        for(int i= nums.length-1; count>0; count--,i--){
            nums[i]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
}
