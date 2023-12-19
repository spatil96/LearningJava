package LeetCode.BinarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,2,3,4,5,6,7,8,9};
        int target = 9;
        System.out.println(search(arr,target) );
    }
    static int search(int[] arr, int target){
        int start = 0;//as array starts at zero
        int end = arr.length-1; // till the end of array -1 becoz Array starts at zero
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target == arr[mid]) return mid;
            if(target>arr[mid]){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }
}
