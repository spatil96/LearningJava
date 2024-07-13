package LeetCode.HashMap;
import java.util.*;
public class IsomorphicStrings205 {
    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg", "add"));
    }
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        //     if(s.equalsIgnoreCase(t)){return true;}
        //     for(int i = 0; i < s.length(); i++){
        //         char sc = s.charAt(i);
        //         char tc = t.charAt(i);
        //         if(hm.containsKey(sc) ){
        //          if(hm.get(sc)==tc){continue;}
        //         if(hm.get(sc)!=tc){return false;}}
        //         else if(findKeyByValue(hm, tc)){hm.put(sc,tc);}
        //          else{return false;}
        //     }
        //     return true;
        // }
        // public static boolean findKeyByValue(HashMap<Character, Character> map, Character value) {
        //     for (Map.Entry<Character, Character> entry : map.entrySet()) {
        //         if (entry.getValue().equals(value)) {
        //             return false;
        //         }
        //     }
        //     return true;
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                if(map.get(s.charAt(i)) != t.charAt(i)) return false;
            }
            else{
                if(map.containsValue(t.charAt(i))) return false;
                else map.put(s.charAt(i),t.charAt(i));
            }
        }

        return true;
    }
}
