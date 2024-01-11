package LeetCode.Arrays101;

public class ReverseString {
    public static void main(String[] args) {
//        reverseString(new char[]{'H','a','n','n','a','h'});
        reverseString(new char[]{'H','e','l','l','o'});
    }
    public static void reverseString(char[] s) {
        int left =0;
        int right =s.length-1;
        System.out.println(s);
        while(left<=right){
            char temp = s[right];
            s[right]=s[left] ;
            s[left] = temp;
            left++;right--;
        }
        System.out.println(s);
    }
}
