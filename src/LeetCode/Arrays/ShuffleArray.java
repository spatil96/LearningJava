package LeetCode.Arrays;

public class ShuffleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,1,3,4,7};
		int n=nums.length/2;
		System.out.println(shuffle(nums, n).toString());
 	}
	public static int[] shuffle(int[] nums, int n) {
		int[] result = new int[nums.length];
        int f=0;
        int m=n;
        for(int i=0; i<=((nums.length-1)); i+=2){
            result[i] = nums[f];
            result[i+1] = nums[m];
            f++;
            m++;
        }
        return result;
    }

}
