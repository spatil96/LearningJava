package LeetCode.Strings;
/*
i) It is the simplest method which uses brute force approach.

ii) It is a straight forward approach of solving the problem.

iii) It compares first character of pattern with searchable text. If match is found, pointers in both strings are advanced. If match not found, pointer of text is incremented and pointer ofpattern is reset. This process is repeated until the end of the text.

iv) It does not require any pre-processing. It directly starts comparing both strings character by character.

v) Time Complexity = O(m* (n-m))

 */
public class NaiveAlgo {
    public static void main(String[] args) {
//        String txt = "AABAACAADAABAAABAA";
//        String pat = "AABA";
        String txt = "THIS IS A TEST TEXT";
        String pat = "TEST";
        search(txt, pat);
    }
    public static void search(String txt,String pat){
        int lenOfPat = pat.length();
        for (int i=0; i<txt.length()-pat.length(); i++){
            String subS = txt.substring(i,i+lenOfPat);
            if(pat.equals(subS)) {
                System.out.println(i);
            }
        }
    }
}
