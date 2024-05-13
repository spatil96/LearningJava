package LeetCode.HashMap;

import java.lang.reflect.Array;
import java.util.*;

public class TopkFrequentElements {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString((topKFrequent(new int[]{1,1,1,2,2,3},2))));
        System.out.println(Arrays.toString((topKFrequentPQ(new int[]{10,10,10,2,2,3},2))));
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
    public static int[] topKFrequentPQ(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(Integer i : nums){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            pq.add(e);
        }
        int[] ans = new int[k];
        for(int i = 0; i < k; i++){
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }
}
