package LeetCode.Arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
    }
    public static int maxArea(int[] height) {
        int left = 0;
        int right  = height.length-1;
        int max=0;
        while(left<right){
            if(height[left]<=height[right]){
                max = Math.max(((right - left) * height[left]), max);
                left++;
            }
            else{
                max = Math.max(((right - left) * height[right]), max);
                right--;
            }
        }
        return max;
    }
}