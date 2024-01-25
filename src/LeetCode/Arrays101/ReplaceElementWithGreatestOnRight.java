package LeetCode.Arrays101;

import java.util.Arrays;

public class ReplaceElementWithGreatestOnRight {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(replaceElements(new int[]{17,18,3,5,6,1})));
        System.out.println(Arrays.toString(replaceElementsEfficient(new int[]{17,18,5,4,6,1})));
    }

    private static int[] replaceElementsEfficient(int[] ints) {
        if(ints.length <=1 ) return new int[] {-1};
        int max = ints[ints.length-1];
        ints[ints.length-1] =-1;
        System.out.println(max);
        for(int i= ints.length-1; i>0;i--){
            int temp = ints[i-1];
            ints[i-1]=max;
            if(temp>max){
                max= temp;
            }
        }
        return ints;
    }

    public static int[] replaceElements(int[] arr) {
        if(arr.length <=1 ) return new int[] {-1};
        for(int i = 0; i <= arr.length-1; i++){
            int max = Integer.MIN_VALUE;

            for (int j = i+1; j<= arr.length-1; j++){
                //int temp= arr[j+1];
                if(max<arr[j]){
                    max = arr[j];
                }
            }
            arr[i]=max;
        }
        arr[arr.length-1] = -1;
        return arr;
    }
}
