package HackerRank.Java;
import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String testCase = "{(([])[])[]]}";
        String result = isBalanced(testCase);
        System.out.println("Is the string balanced? " + result);
    }

    public static String isBalanced(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
            } else {
                if (st.empty()) {
                    return "NO";
                } else if (s.charAt(i) == ')' && st.peek() == '(') {
                    st.pop();
                } else if (s.charAt(i) == '}' && st.peek() == '{') {
                    st.pop();
                } else if (s.charAt(i) == ']' && st.peek() == '[') {
                    st.pop();
                }else{
                    return "NO";
                }
            }
        }
        if (st.empty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}
