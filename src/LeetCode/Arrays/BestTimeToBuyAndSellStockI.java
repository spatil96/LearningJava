package LeetCode.Arrays;

public class BestTimeToBuyAndSellStockI {
    public static void main(String[] args) {


        //int[] arr = {7, 1, 5, 3, 6, 4};
        int [] arr = {7,6,4,3,1};
        int buyStockPrice = arr[0];
        int maxProfit = 0;

        for (int price : arr) {
            if (price < buyStockPrice) {
                buyStockPrice = price;
            } else if (price - buyStockPrice > maxProfit) {
                maxProfit = price - buyStockPrice;
            }
        }
        System.out.println(maxProfit);
    }
}
