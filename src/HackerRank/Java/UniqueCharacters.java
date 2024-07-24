package HackerRank.Java;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(uniqueChar1("sunday is the best sundae"));
        System.out.println(uniqueChar1("sunday"));
    }
    public static String uniqueChar(String inputValue){
        char[] ch = inputValue.toCharArray();
        Set<Character> st = new HashSet<>();
        for(char c: ch){
            if(st.contains(c)){
                return "false";
            }
            else{
                st.add(c);
                System.out.println(c);
            }
        }
        return "true";
    }
    public static boolean uniqueChar1(String inputValue){
        char[] ch = inputValue.toCharArray();
        Set<Character> st = new HashSet<>();
        for(char c: ch){

                st.add(c);


        }
        return st.size() == inputValue.length();
    }
}
