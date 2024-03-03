package LeetCode;

import java.util.HashSet;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {
//        System.out.println(lengthOfLongestSubstring("pwwkew"));
//        System.out.println(lengthOfLongestSubstring("bbbb"));
//        System.out.println(lengthOfLongestSubstring("abcabcbe"));
//        System.out.println(lengthOfLongestSubstring(" "));
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet hs = new HashSet<>();
        char[] ch = s.toCharArray();
        int longest =0;
        int left = 0;
        while(left<ch.length) {
            for (int i = left; i < ch.length; i++) {
                if (!hs.contains(ch[i])) {
                    hs.add(ch[i]);
                } else {
                    longest = Math.max(longest, hs.size());
                    hs.clear();
//                    hs.add(ch[i]);
                    left =i;
                }
            }
        }
        return Math.max(longest, hs.size());
    }
}
