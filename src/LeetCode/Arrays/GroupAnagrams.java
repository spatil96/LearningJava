package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
//        System.out.println(groupAnagrams(new String[]{"a"}));
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> hm= new HashMap<>();
        for(String s : strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            if(!hm.containsKey(sorted)){
                hm.put(sorted, new ArrayList<>());
            }
            hm.get(sorted).add(s);
        }
        result.addAll(hm.values());
        return result;
    }
}
