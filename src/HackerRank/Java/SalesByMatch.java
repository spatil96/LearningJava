package HackerRank.Java;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SalesByMatch {
    public static void main(String[] args) {
        List<Integer> stocks = List.of(10, 20, 20, 10, 10, 30, 50, 10, 20);
        System.out.println(sockMerchant(9, stocks));
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int pairs=0;
        Set<Integer> s = new HashSet<>();
        for(int i=0; i<ar.size();i++){
            if(!s.contains(ar.get(i))){
                s.add(ar.get(i));
            }else{
                pairs++;
                s.remove(ar.get(i));
            }
        }
        return pairs;
    }
}
