package LeetCode.Easy;

public class NextGreatestLetter744 {
    public static void main(String[] args) {
        char[] letters = {'c','f','g'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters,target));

    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            //if(target < letters[mid]) return letters[mid];
            if(target<letters[mid]){
                //start = mid+1;
                end = mid-1;
            }else{
                //end = mid-1;
                start = mid+1;
            }
        }
        return letters[start % letters.length];
    }
}
