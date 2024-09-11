package LeetCode.Recursion;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n == 1) return 1;

        int prev2 = 1;
        int prev1 = 2;

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
    public static int climbStairsRec(int n) {
        if(n==0){return 0;}
        int res = countWays(n);
        return res;
    }
    public static int countWays(int n){
        int res=0;
        if(n==0 ){

            return 1;
        }
        if(n<0){return 0;}
        res += countWays(n-1);
        res+=countWays(n-2);
        return res;
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(5));
        System.out.println(climbStairsRec(5));

    }
}
