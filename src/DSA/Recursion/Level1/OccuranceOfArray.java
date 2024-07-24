package DSA.Recursion.Level1;

public class OccuranceOfArray {
    public static void main(String[] args) {
        System.out.println(
                firstIndex(
                        new int[] {0,0,3,4,5,2,3,4,5},
                        0,3
                )
        );
    }
    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length-1){
            return -1;
        }
        if(arr[x] == x ){
            return idx;
        }else{
            return firstIndex(arr,idx+1,x);
        }
    }
}
