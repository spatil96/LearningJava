package LeetCode.Arrays101;

public class ValidMountainArray {
    public static void main(String[] args) {
//        System.out.println(validMountainArray(new int[] {0,3,2,1}));
        System.out.println(validMountainArray(new int[] {0,1,2,3,4,5,6,7,8,9}));
    }
    public static boolean validMountainArray(int[] s) {
        int left =0;
        int right =s.length-1;
        System.out.println(s.length);//4 FOR {0,3,4,1}
        if(s.length<3) return false;
        for(int i: s) {
            if(right==s.length || left == s.length) return false;
            if (s[right - 1] > s[right]) {
                right--;
            }
            if (s[left] < s[left + 1]) {
                left++;
            }
        }
        return left == right;
    }
}
