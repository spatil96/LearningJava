package LeetCode.Strings;

import java.util.HashSet;

public class LongestSubStringWithOutRepeatingChar3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int res = 1; // since the string is non emptu all the time we can definately set it for one
        char[] ch = s.toCharArray();
        if(ch.length ==0) return 0;
        for(char c : ch){
            if(!hs.add(c)){
                if(hs.size() >= res) {
                    hs.clear();
                }
            }
            hs.add(c);
        }
        return res;
    }
}
