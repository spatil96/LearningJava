package DSA.Recursion.Level1;

public class MaxOfArray {
    public static void main(String[] args) {
        System.out.println(
                maxOfArray(new int[]{2000,30,100,0,100,2,1,1000},
                        0));
    }
    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length-1){return arr[idx];}
        int misa = maxOfArray(arr, idx+1);
        if(misa>arr[idx]){return misa;}
        else{return arr[idx];}
    }
}
