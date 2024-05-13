package DSA.Recursion;

public class SubOfSubsets {
    public static void main(String[] args) {
        printTargetSubsets(new int[]{10,20,30,40,50}, 0,"",0,50);
    }
    public static void printTargetSubsets(int[] arr, int idx, String set, int sos, int tar){
        if(idx == arr.length){
            if(sos == tar) {
                System.out.println(set +".");
            }
            return;
        }
        printTargetSubsets(arr, idx+1, set+arr[idx] + ", ", sos + arr[idx],tar);
        printTargetSubsets(arr, idx+1, set, sos,tar);
    }
}
