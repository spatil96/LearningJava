package LeetCode.Arrays;

public class RichestCustomerWealth1672 {
    public static void main(String[] args) {
        int[][] accounts1 = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(maximumWealth(accounts1));  // Output: 6

        int[][] accounts2 = {{1, 5}, {7, 3}, {3, 5}};
        System.out.println(maximumWealth(accounts2));  // Output: 10

        int[][] accounts3 = {{2, 8, 7}, {7, 1, 3}, {1, 9, 5}};
        System.out.println(maximumWealth(accounts3));  // Output: 17
    }
    public static int maximumWealth(int[][] accounts) {
        int result=0;
        for(int row=0; row<accounts.length; row++){
            int rowSum=0;
            for(int col=0;col<accounts[row].length; col++){
                rowSum+=accounts[row][col];
            }
            if(result<rowSum)   result=rowSum;
        }
        return result;
    }
}

