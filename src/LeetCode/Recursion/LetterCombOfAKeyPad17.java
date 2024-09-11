package LeetCode.Recursion;
import java.util.*;
public class LetterCombOfAKeyPad17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("567"));
    }
    private static final Map<Integer, String> letters = Map.of(
            2, "abc", 3, "def", 4, "ghi", 5, "jkl",
            6, "mno", 7, "pqrs", 8, "tuv", 9, "wxyz");
    public static List<String> res = new ArrayList<>();
    public static List<String> letterCombinations(String digits) {
        StringBuilder sb = new StringBuilder();
        if(digits.isEmpty())
            return res;
        backtracking(0, sb, digits);
        return res;
    }
    public static void backtracking(int start, StringBuilder sb, String digits){
        if (sb.length() == digits.length()) {
            res.add(sb.toString());
            return;
        }

        char c = digits.charAt(start);
        String letter = letters.get(c - '0');
        for (int j = 0; j < letter.length(); j ++) {
            sb.append(letter.charAt(j));
            backtracking(start + 1 , sb, digits);
            sb.deleteCharAt(sb.length() -  1);
        }

    }
}
