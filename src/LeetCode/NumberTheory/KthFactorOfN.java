package LeetCode.NumberTheory;

import java.util.ArrayList;
import java.util.Collections;

public class KthFactorOfN {
    public static void main(String[] args) {
        System.out.println(kthFactor(2,2));
    }
    public static int kthFactor(int n, int k) {
        ArrayList<Integer> li = new ArrayList<Integer>(n/2);
//        int mid = n/2;
        int left = 1;
        int right  = n/2;
        while(left<=right ){
            if(n%left==0){
                li.add(left);
            }
            if(n%right==0 && left!=right){
                li.add(right);
            }
            left++;
            right--;
        }
        Collections.sort(li);
        li.add(n);
        System.out.println(li.toString());
        System.out.println(li.size());
//        System.out.println(li.get(k));
        System.out.println(li.get(k-1));
        return (k>li.size()) ? -1: li.get(k-1);
    }
}
