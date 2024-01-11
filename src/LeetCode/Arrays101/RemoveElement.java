package LeetCode.Arrays101;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        System.out.println(removeElement1(new int[]{3, 2, 2, 3}, 3));
    }
    public static int removeElement1(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count] = nums[i];
                count++;
            }
        }
        // If you want to print the modified array, you can use Arrays.toString
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, count)));
        return count;
    }
    public static int removeElement(int[] nums, int val) {
        int[] res = new int[nums.length];
        int count = 0;

        System.out.println(Arrays.toString(res));
        return count;
    }
}
