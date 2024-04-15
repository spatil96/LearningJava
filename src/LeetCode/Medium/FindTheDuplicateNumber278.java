package LeetCode.Medium;

public class FindTheDuplicateNumber278 {
    public static void main(String[] args) {
        System.out.println(findDuplicate(new int[]{1,3,4,2,2}));
    }
    public static int findDuplicate(int[] nums) {
        boolean[] val = new boolean[nums.length];
        for(int num:nums){
            if(val[num]){
                return num;
            }
            val[num] = true;
        }
        return 0;

    }
}
