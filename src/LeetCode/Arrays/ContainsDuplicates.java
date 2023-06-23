package LeetCode.Arrays;

public class ContainsDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4,1,1,1};
		if (containsDuplicate(arr)) {
			System.out.println("Duplicates Present");
		} else {
			System.out.println("No duplicates present");
		}
	}

	public static boolean containsDuplicate(int[] nums) {
		if (nums.length == 0) {
			return false;
		} else {
			for (int num = 0; num < nums.length - 1; num++) {
				for(int j=num+1; j<nums.length; j++) {
					if(nums[num] == nums[j]) {
						return true;
					}
				}
			}
			return false;
		}
	}

}
