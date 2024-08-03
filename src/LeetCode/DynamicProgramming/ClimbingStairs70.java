package LeetCode.DynamicProgramming;

public class ClimbingStairs70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(4));
        System.out.println(climbStairsItr(4));
    }
    public static int climbStairs(int n) {
             if(n==0){return 1;}
             else if(n<0){return 0;}
             return climbStairs(n-1)+climbStairs(n-2);
         }
    public static int climbStairsItr(int n) {
        if (n <= 1) {
            return 1;
        }

        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}
