package LeetCode.Arrays101;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9})));
        System.out.println(Arrays.toString(plusOne(new int[]{1,2,3,4})));
//        System.out.println(Arrays.toString(plusOne(new int[]{4,5,6,9,9})));
    }
    public static int[] plusOne(int[] digits){
        int left = digits.length-2;
        int right  = digits.length-1;
        System.out.println(left);
        System.out.println(right);
        int temp=0;
        if(digits[right] != 9){
            temp = digits[right];
            digits[right] = temp+1;
            return digits;
        }
        while(left>=0){
//            int
            if(digits[right]==9){
                digits[right] = 0;
                temp = digits[left];
                digits[left] = temp+1;
            }
            left--;
            right--;

        }
        return new int[]{0};
    }
}
