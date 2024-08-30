package DSA;

import java.util.Stack;

public class QuickSortItr {

    // Utility method to swap elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Partition method similar to the one used in recursive quicksort
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Pivot element
        int i = low - 1; // Index of smaller element

        for (int j = low; j < high; j++) {
            // If the current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1; // Return the partitioning index
    }

    // The main iterative quicksort method
    public static void quickSort(int[] arr) {
        int n = arr.length;
        Stack<int[]> stack = new Stack<>();

        // Push initial values of low and high
        stack.push(new int[]{0, n - 1});

        // Keep popping from the stack while it's not empty
        while (!stack.isEmpty()) {
            int[] current = stack.pop();
            int low = current[0];
            int high = current[1];

            // Partition the array
            int pi = partition(arr, low, high);

            // If there are elements on the left side of the pivot, push left side to stack
            if (pi - 1 > low) {
                stack.push(new int[]{low, pi - 1});
            }

            // If there are elements on the right side of the pivot, push right side to stack
            if (pi + 1 < high) {
                stack.push(new int[]{pi + 1, high});
            }
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Main method to test the quicksort implementation
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};
        System.out.println("Original array:");
        printArray(arr);

        quickSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}

