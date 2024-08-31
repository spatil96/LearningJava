package DSA.Recursion.Level1;

import java.util.Arrays;

public class FirstAndLastIndexOfOccurance {
    public static void main(String[] args) {
      //  System.out.println(LastIndex(new int[]{2,3,6,9,8,3,2,3,6,4},0,6));
       // System.out.println(FirstIndex(new int[]{2,3,6,9,8,3,2,3,6,4},0,6));
        System.out.println(Arrays.toString(AllIndex(new int[]
                {2, 3, 6, 9, 8, 3, 2, 3, 6, 4}, 0, 6, 0)));
    }

    private static int[] AllIndex(int[] arr, int idx, int x,int fsf){
        if(arr.length == idx){
            return new int[fsf];
        }
        int[] allIdx;
        if(arr[idx] == x){
            allIdx = AllIndex(arr, idx + 1, x, fsf + 1);
            allIdx[fsf] = idx;
        }else{
            allIdx = AllIndex(arr, idx + 1, x, fsf);
        }
        return allIdx;
    }

    private static int FirstIndex(int[] arr, int idx, int x) {
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == x){
            return idx;
        }else{
            int fiisa = FirstIndex(arr, idx+1,x);
            System.out.println(fiisa);
            return fiisa;
        }
    }

    static int LastIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        int liisa = LastIndex(arr, idx+1, x);
        if(liisa==-1){
            if(arr[idx]==x){
                return idx;
            }else{
                return -1;
            }
        }else{
            return liisa;
        }
    }

}
