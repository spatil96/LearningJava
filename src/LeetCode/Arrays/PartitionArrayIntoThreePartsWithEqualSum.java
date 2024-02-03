package LeetCode.Arrays;

public class PartitionArrayIntoThreePartsWithEqualSum {
    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[] {0,0,0,0}));
    }
    public static boolean canThreePartsEqualSum(int[] arr) {
        if (arr.length < 3) return false;
        int totalSum = 0;
        int sumForEachSubArray = 0;
        for (int i : arr) {
            totalSum += i;
        }
        if (totalSum % 3 != 0) {
            return false; // Total sum is not divisible by 3
        }
        sumForEachSubArray = totalSum / 3;
        //if(sumForEachSubArray ==0) return true;

        int count = 0;
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            temp += arr[i];
            if (temp == sumForEachSubArray) {
                count++;
                temp = 0;
            }
        }

        return count >= 2;// ? true : false;
    }
}
