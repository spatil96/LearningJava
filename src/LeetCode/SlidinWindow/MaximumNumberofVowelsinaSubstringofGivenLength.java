package LeetCode.SlidinWindow;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumNumberofVowelsinaSubstringofGivenLength {
    public static void main(String[] args) {
        System.out.println(maxVowels("leetcode", 3));
    }
    public static int maxVowels(String s, int k) {
        int left = 0;
        int right = 0;

        ArrayList<Character> li = new ArrayList<>();
        Collections.addAll(li, 'a','e','i','o','u');
        System.out.println(li);
        System.out.println("------------");
        System.out.println(s.charAt(0));
        System.out.println("------------");
        int maxVowel = 0;
        int countVowel = 0;
        while (right < s.length()) {
            if (isVowel(s.charAt(right))) {
                countVowel++;
            }
            if (right - left + 1 > k) {
                if (isVowel(s.charAt(left))) {
                    countVowel--;
                }
                left++;
            }
            maxVowel = Math.max(maxVowel, countVowel);
            right++;
        }
        return maxVowel;
    }

    private static boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
