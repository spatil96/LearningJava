package LeetCode.DynamicProgramming;

public class LongestPalindromicSubString {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));
    }
//    public static String longestPalindrome(String s) {
//        char[] ch = s.toCharArray();
//        int left = 0;
//        int right  = ch.length-1;
//        if(ch.length == 2){ if (ch[0] == ch [1]){ return s;}else{ return String.valueOf(ch[0]);}}
//        StringBuilder sbLeft = new StringBuilder("");
//        StringBuilder sbRight = new StringBuilder("");
//        while(left<=right){
//            if(ch[left] == ch[right] && left != right){
//                sbLeft.append(ch[left]);
//                sbRight.append(ch[right]);
//            }
//            else if(left == right){
//                sbLeft.append(ch[left]);
//            }
//            left++;right--;
//        }
////        System.out.println(sbLeft);
////        System.out.println(sbRight);
//        return sbLeft.toString()+sbRight.toString();
//    }
public static String longestPalindrome(String s) {
    if (s == null || s.isEmpty()) {
        return "";
    }

    int start = 0, end = 0;

    for (int i = 0; i < s.length(); i++) {
        int len1 = expandAroundCenter(s, i, i);     // Odd length palindrome
        int len2 = expandAroundCenter(s, i, i + 1); // Even length palindrome
        int maxLength = Math.max(len1, len2);

        if (maxLength > end - start) {
            start = i - (maxLength - 1) / 2;
            end = i + maxLength / 2;
        }
    }

    return s.substring(start, end + 1);
}

    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
