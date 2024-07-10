package LeetCode.Stack;
import java.util.*;
public class CrawlerLogFolder1598 {
    public static void main(String[] args) {
//        System.out.println(minOperations(new String[]{"d1/","d2/","../","d21/","./"}));
        System.out.println(minOperations(new String[]{"./","../","./"}));
    }
    public static int minOperations(String[] logs) {
        Stack<String> st = new Stack<>();
        for(String s: logs){
            if(s.equalsIgnoreCase("./")){
                continue;
            }
            if(s.equalsIgnoreCase("../") && st.size() !=0){
                st.pop();
            }
            else if(!(s.equalsIgnoreCase("../") || s.equalsIgnoreCase("./"))){
                st.push(s);}
        }
        return st.size();
    }
}
