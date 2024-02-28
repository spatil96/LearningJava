package LeetCode.HashMap;

import java.lang.reflect.Array;
import java.util.*;

public class TopkFrequentElements {
    public static void main(String[] args) {
        System.out.println(Arrays.toString((topKFrequent(new int[]{1,1,1,2,2,3},2))));
    }
    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        // Create a list of entries from the HashMap
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(hm.entrySet());

        // Sort the list based on the frequency (value of entries)
        Collections.sort(list, (a, b) -> b.getValue() - a.getValue());

        // Extract the top k frequent elements
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i).getKey();
        }
        return result;
    }
}
