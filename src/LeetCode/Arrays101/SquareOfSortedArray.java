package LeetCode.Arrays101;

import java.util.Arrays;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 3, 10})));
    }

    private static int[] sortedSquares(int[] ints) {
        int res[] = new int[ints.length];
            int index=ints.length-1;
            int left= 0;
            int right  = ints.length-1;
            while(left<=right){
                int leftSquare = ints[left]*ints[left];
                int rightSquare = ints[right]*ints[right];
                if(leftSquare>rightSquare){
                    res[index--]= leftSquare;
                    left++;
                }else {
                    res[index--] = rightSquare;
                    right--;
                }
            }
        return res;
    }
//        public static int[] sortedSquares(int[] nums) {
//            int[] res = new int[nums.length];
//            for (int i = 0; i < nums.length; i++) {
//                res[i] = nums[i] * nums[i];
//            }
//            Arrays.sort(res);
//            return res;
//        }
}
