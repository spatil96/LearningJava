package DSA.Recursion.Level1;

public class TargetSumSubset {
    public static void main(String[] args) {
        printTargetSubset(
                new int[]{10,20,30,40,50,60},
                0,"",0,60
        );
    }
    private static void printTargetSubset(
            int[] arr, int idx,String set, int sos, int tar){
        if(idx == arr.length){
            if(sos == tar){
                System.out.println(set+".");
            }
            return;
        }
        printTargetSubset(arr, idx+1, set+arr[idx]+" ,", sos+arr[idx],tar);
        printTargetSubset(arr, idx+1, set, sos,tar);
    }
}
