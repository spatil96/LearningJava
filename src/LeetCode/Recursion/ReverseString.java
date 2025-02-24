package LeetCode.Recursion;

public class ReverseString {
    public static void main(String[] args) {
        String s= "HelloWorld";
//        reverseString(s);
        String reversed = reverseStringRecursion(s);
        System.out.println("Reversed String: " + reversed);
    }
    public static void reverseString(String s){
        if(s.isEmpty()){return ;}
        StringBuilder helper = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            helper.append(s.charAt(i));  // Append characters in reverse order
        }

        System.out.println("Reversed String: " + helper.toString());
    }
    public static String reverseStringRecursion(String s) {
        // Base case: if the string is empty, return an empty string
        if (s.isEmpty()) {
            return s;
        }
        // Recursive case: get the last character and call reverse on the rest of the string
//        return reverseStringRecursion(s.substring(1)) + s.charAt(0);
        return s.charAt(0) + reverseStringRecursion(s.substring(1));
    }
}
