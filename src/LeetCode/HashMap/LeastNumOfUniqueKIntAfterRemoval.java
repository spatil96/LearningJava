package LeetCode.HashMap;

import java.util.HashMap;
import java.util.PriorityQueue;

public class LeastNumOfUniqueKIntAfterRemoval {
    public static void main(String[] args) {
        System.out.println(findLeastNumOfUniqueInts(new int[]{5,5,2},1));
        System.out.println(findLeastNumOfUniqueInts(new int[]{4,3,1,1,3,3,2},3));
    }
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i : arr){
            int j = hm.get(i)==null ?0 :hm.get(i);
            hm.put(i, j+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(hm.values());
        while(k>0){
            k-=pq.poll();
        }
        return k <0 ? pq.size()+1 : pq.size();
    }
}
