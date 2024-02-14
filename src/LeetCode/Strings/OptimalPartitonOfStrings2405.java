package LeetCode.Strings;
import java.util.HashSet;

public class OptimalPartitonOfStrings2405 {
    public static void main(String[] args) {
        System.out.println(partitionString("ssssss"));
        System.out.println(partitionString("abacaba"));
    }
    public static int partitionString(String s) {
        HashSet<Character> hs = new HashSet<>();
        int res = 1; // since the string is non emptu all the time we can definately set it for one
        char[] ch = s.toCharArray();
        for(char c : ch){
            if(!hs.add(c)){
                res++;
                hs.clear();
            }
            hs.add(c);
        }
    return res;
    }
}
