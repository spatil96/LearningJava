package HackerRank.Java;

import java.util.HashSet;

public class TwoStrings {
    public static void main(String[] args) {
        System.out.println(twoStrings("hello","world"));
        System.out.println(twoStrings("a","b"));
    }
    public static String twoStrings(String s1, String s2) {
        // Write your code here
        HashSet<Character> s1Char = new HashSet<>();
        HashSet<Character> s2Char = new HashSet<>();
        for(int i=0; i<s1.length();i++){
            s1Char.add(s1.charAt(i));
        }
        for(int i=0; i<s2.length();i++){
            s2Char.add(s2.charAt(i));
        }
        s1Char.retainAll(s2Char);
        return s1Char.isEmpty() ? "NO" : "YES";
    }
}
