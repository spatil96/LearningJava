package LeetCode.Easy;

public class LinearSearch{
    public static void main(String []args){
        int[] arr = {1,2,312,12,2,1,2,3,2,45,36,45,4,7,6,7,8,76,876,9,76};
        int target = 87112;
        if(linearSearch(arr, target)){
            System.out.println("Element found");
        }
        else{
            System.out.println("Element not found");
        }
    }
     static boolean linearSearch(int[] arr, int target){
         if (0 != arr.length) {
             for (int e : arr) {
                 if (e == target) {
                     return true;
                 }
             }
         }
         return false;
     }
}