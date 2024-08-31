package DSA.Recursion.Level1;

import java.util.ArrayList;
import java.util.List;

public class GetSubSequence {
    public static void main(String[] args) {
        System.out.println(getSubsequence("abcd"));
    }
    private static List<String> getSubsequence(String str){
        List<String> result = new ArrayList<>();
        if(str.isEmpty()){
            result.add("");
            return  result;
        }
        char firstChar = str.charAt(0);
        String remainString = str.substring(1);
        List<String> subSeqOfRemainingString = getSubsequence(remainString);
        result.addAll(subSeqOfRemainingString);
        for(String s: subSeqOfRemainingString){
            result.add(s+firstChar);
        }
        System.out.println(result.size());
        return result;
    }
}
