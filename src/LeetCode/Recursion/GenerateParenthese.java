package LeetCode.Recursion;

import java.util.*;

public class GenerateParenthese {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(0));
//        System.out.println(generateParenthesisGPT(1));
    }
    public static  List<String> generateParenthesis(int n) {
        List<String> s= new ArrayList<>();
        s=  genValidPar(n, n, "(");
        // System.out.println(s);
        return s;
    }
    public static List<String> genValidPar(int open, int close, String res){
        List<String> result = new ArrayList<>();

        if(open ==0 && close ==0){
            List<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        List<String> openBraces = new ArrayList<>();;
        List<String> closeBraces = new ArrayList<>(); ;
        if(open>=1) {
            openBraces = genValidPar(open - 1, close, res + "(");
        }
        if(close>open) {
            closeBraces = genValidPar(open, close - 1, res + ")");
        }
        for(String s: openBraces){
            result.add(s+")");
        }
        for(String s: closeBraces){
            result.add(s+"(");
        }
        return result;
    }
    //chatGPT
    public static List<String> generateParenthesisGPT(int n) {
        List<String> par = new ArrayList<>();
        backTrack(n ,"",par,0,0);
        return par;
    }

    private static void backTrack(int n,String curr ,List<String> par,int open, int close){
        if(curr.length() == n*2){
            par.add(curr);
            return;
        }
        if(open<n)
            backTrack(n,curr+"(", par,open+1, close);
        if(close< open)
            backTrack(n,curr+")", par,open,close+1);
    }
}
