package LeetCode.Arrays;

public class BestTimeToBuyAndSellStockI {
    public static void main(String[] args) {


        int[] arr = {7, 1, 5, 3, 6, 4};
        int [] arr1 = {7,6,4,3,1};
        int buyStockPrice = arr[0];
        int maxProfit = 0;

        for (int price : arr) {
            if (price < buyStockPrice) {
                buyStockPrice = price;
            } else if (price - buyStockPrice > maxProfit) {
                maxProfit = price - buyStockPrice;
            }
        }
//        System.out.println(maxProfit);
        System.out.println(maxProfit(arr));
        System.out.println(maxProfit(arr1));
    }
    public static int maxProfit(int[] prices) {
        int max = -1;
        int minBuy = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            if(minBuy > prices[i]) {
                minBuy = prices[i];
            } else if(prices[i] - minBuy > max){
                max = prices[i] - minBuy ;
            }
        }
        return max == -1?0:max;
    }
}
