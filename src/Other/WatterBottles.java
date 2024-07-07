package Other;

public class WatterBottles {
    public static void main(String[] args) {
        System.out.println(numWaterBottles(15,4));
    }
    public static int numWaterBottles(int numBottles, int numExchange) {
        int drankWaterBottle = numBottles;
        if(numExchange>numBottles){return drankWaterBottle;}
        int bottleToExchange = numBottles;
        while(bottleToExchange >= numExchange){
            int temp = bottleToExchange/numExchange;
            drankWaterBottle+=temp;
            bottleToExchange =temp;
        }
        return drankWaterBottle;
    }
}
