package LeetCode.Strings;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseVowelsOfaString {
    public static void main(String[] args) {
        System.out.println(reverseVowels("aA")); //o/p->Aa
    }
    public static String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int left = 0;
        int right  = ch.length-1;
        ArrayList<Character> li = new ArrayList<Character>(Arrays.asList('a','e','i','o','u', 'A','E','I','O','U'));
        while(left<right){
            if(li.contains(ch[left]) &&li.contains(ch[right]) ){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;right--;
            }
            if(!li.contains(ch[left])){
                left++;
            }
            if(!li.contains(ch[right])){
                right--;
            }
        }
        return String.valueOf(ch);
    }
}
