package LeetCode.Strings;

public class LargestNumberAtLeastTwiceOfOthers {
    public static void main(String[] args) {
        System.out.println(dominantIndex(new int[] {3,6,1,0}));
        System.out.println(dominantIndex(new int[] {1,2,3,4}));
    }
    public static int dominantIndex(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }

        int maxIndex = 0;
        int secondMaxIndex = -1;

        // Find the index of the largest and second largest elements
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                secondMaxIndex = maxIndex;
                maxIndex = i;
            } else if (secondMaxIndex == -1 || nums[i] > nums[secondMaxIndex]) {
                secondMaxIndex = i;
            }
        }

        // Check if the largest element is at least twice as much as the second largest element
        if (nums[maxIndex] >= 2 * nums[secondMaxIndex]) {
            return maxIndex;
        }

        return -1;
    }
}
