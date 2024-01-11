package LeetCode.Arrays101;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        merge(new int[]{1,2,3,0,0,0},3, new int[]{2,5,6},3 );
        /*
            Output: [1,2,2,3,5,6]
            Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
            The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
         */
    }
    //Solving with brute-force/first approach I can think of
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            nums1=nums2;
        }
        int num1len =0;
        int num2Len = 0;
//        if(n==0) // no need to consider since m would be the required array
        while (m<nums1.length ){
            if(nums1[num1len]<=nums2[num2Len]){
                nums1[m++] = nums2[num2Len];
                n--;num2Len++;num1len++;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
