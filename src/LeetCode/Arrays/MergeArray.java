package LeetCode.Arrays;

public class MergeArray {

        public static String mergeAlternately(String word1, String word2) {
            StringBuilder res= new StringBuilder();
            int j= Math.max(word1.length(), word2.length());
            for (int i=0; i <= j ;i++){
                if(i<word1.length()){
                    res.append(word1.charAt(i));
                }
                if(i<word2.length()){
                    res.append(word2.charAt(i));
                }
            }
            return res.toString();
        }

    public static void main(String[] args) {
        String word1= "abc";
        String word2 = "pqrs";
        System.out.println(mergeAlternately(word1,word2));
    }
}
