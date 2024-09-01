package DSA.Recursion.Level1;

import java.util.ArrayList;
import java.util.List;

public class GetSubSequence {
    public static void main(String[] args) {
        long startTimePrintSS = System.nanoTime();
        printSS("abcd", "");
        long endTimePrintSS = System.nanoTime();
        System.out.println("Time taken by printSS: " +
                (endTimePrintSS - startTimePrintSS) + " nanoseconds");

        // Measure time for getSubsequence method
        long startTimeGetSubsequence = System.nanoTime();
        List<String> subsequence = getSubsequence("abcd");
        long endTimeGetSubsequence = System.nanoTime();
        System.out.println("Time taken by getSubsequence: " +
                (endTimeGetSubsequence - startTimeGetSubsequence) + " nanoseconds");
    }
    private static void printSS(String ques, String ans){
        long startTimePrintSS = System.nanoTime();
        if(ques.isEmpty()){
            System.out.println(ans);
            return ;
        }
        char ch = ques.charAt(0);
        String ros = ques.substring(1);
        printSS(ros, ans+"_");
        printSS(ros, ans+ch);
        long endTimePrintSS = System.nanoTime();
        System.out.println("Time taken by printSS: " +
                (endTimePrintSS - startTimePrintSS) + " nanoseconds");
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
