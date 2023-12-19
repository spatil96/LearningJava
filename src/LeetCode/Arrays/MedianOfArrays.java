package LeetCode.Arrays;

public class MedianOfArrays {
    public static void main(String[] args) {
        int[] arr1= {1,3};
        int[] arr2={2,7};
        System.out.println(findMedianSortedArrays(arr1,arr2));
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergedArray = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) {
            mergedArray[k++] = nums1[i++];
        }

        while (j < nums2.length) {
            mergedArray[k++] = nums2[j++];
        }

        int totalLength = nums1.length + nums2.length;
        if (totalLength % 2 == 0) {
            int mid = totalLength / 2;
            return (mergedArray[mid - 1] + mergedArray[mid]) / 2.0;
        } else {
            int mid = totalLength / 2;
            return mergedArray[mid];
        }
    }
}
