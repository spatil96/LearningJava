package LeetCode.Arrays101;

public class FindNumberswithEvenNumberofDigits {
    public static void main(String[] args) {
        System.out.println(findNumbers(new int[]{ 100,200,232,34,4354,4654,654,6,546,46435}));
    }
    public static int findNumbers(int[] nums) {
        int res=0;
        for(int i:nums){
            int count=0;
            while(i!=0){
                i/=10;
                count++;
            }
            if(count%2==0){res++;}
        }
        return res;
    }
}
