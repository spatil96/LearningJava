package LeetCode.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        System.out.println((ProductFilterExceptSelf(new int[]{1,2,3,4})));
    }
    public static int[] ProductFilterExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        int right = 1, left = 1;
        for (int i = 0; i < nums.length; i++) {
            arr[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= right;
            right *= nums[i];
        }
        return arr;
    }
}
