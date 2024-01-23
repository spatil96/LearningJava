package LeetCode.Arrays101;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[] {4,-7,11,4,18}));
    }
    public static boolean checkIfExist(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i] * 2) || (arr[i] % 2 == 0 && hm.containsKey(arr[i] / 2))) {
                return true;
            }
            hm.put(arr[i], i);
        }
        return false;
    }
}
