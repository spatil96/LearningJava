package DSA.Recursion.Level1;
import java.util.ArrayList;
public class KeyPadCombination {
     private  static final String[] codes = {
            ".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"
    };

    public static void main(String[] args) {
        //ArrayList<String> st = getKPC("678");
       // System.out.println(st);
        printCodes("123","");
    }
    private static ArrayList<String> getKPC(String num){
        ArrayList<String> res = new ArrayList<>();
        if(num.isEmpty() ){
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        char ch = num.charAt(0);
        String restOfString = num.substring(1);

        ArrayList<String> combOfRemainingString= getKPC(restOfString);

        //Code combination logic addition to subsequence logic
        String codeForCh = codes[ch-'0'];
        System.out.println(codeForCh);
        for(int i=0; i< codeForCh.length();i++){
            char chCode = codeForCh.charAt(i);
            for(String s: combOfRemainingString ){
                res.add(chCode+s);
            }
        }
        System.out.println(res.size());
        return res;
    }
    private static void printCodes(String ques, String ans){
        if(ques.isEmpty()){
            System.out.println("ans=>"+ans);
            return;
        }
        char ch = ques.charAt(0);
        System.out.println("ch=>"+ch);
        String ros = ques.substring(1);
        System.out.println("ros =>"+ros);
        String codeForCh = codes[ch - '0'];
        for(int i=0; i <codeForCh.length() ; i++){
            char cho = codeForCh.charAt(i);
            printCodes(ros,ans+cho);
        }
    }
}
