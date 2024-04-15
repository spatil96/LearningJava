package HackerRank.Java;

import java.util.List;
import java.util.Arrays;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        List<Integer> clouds = Arrays.asList(0, 0, 1, 0, 0, 1, 0); // Example list of clouds
        int result = jumpingOnClouds(clouds);
        System.out.println(result); // Print the result
    }

    public static int jumpingOnClouds(List<Integer> c) {
        int res = 0;
        for(int i = 0; i < c.size() - 1; i++) {
            if(c.size() == (i + 2) || c.get(i + 2) == 1) {
                res = res + 1;
            } else {
                i = i + 1;
                res++;
            }
        }
        return res;
    }
}
