package LeetCode.DynamicProgramming;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }
    public static String longestPalindrome(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right  = ch.length-1;
        if(ch.length == 2){ if (ch[0] == ch [1]){ return s;}else{ return String.valueOf(ch[0]);}}
        StringBuilder sbLeft = new StringBuilder("");
        StringBuilder sbRight = new StringBuilder("");
        while(left<=right){
            if(ch[left] == ch[right] && left != right){
                sbLeft.append(ch[left]);
                sbRight.append(ch[right]);
            }
            else if(left == right){
                sbLeft.append(ch[left]);
            }
            left++;right--;
        }
//        System.out.println(sbLeft);
//        System.out.println(sbRight);
        return sbLeft.toString()+sbRight.toString();
    }
}
