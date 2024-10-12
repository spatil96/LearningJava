package Java8.Questions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MergeArrays {
    public static void main(String[] args) {
        // Step 1: Define the input arrays
        int[] array1 = {1, 2, 3};
        int[] array2 = {4, 5, 6};

        // Step 2: Merge the arrays using Streams
        int[] mergedArray = IntStream.concat(Arrays.stream(array1), Arrays.stream(array2))
                .toArray();  // Convert the merged stream to an array

        // Step 3: Display the merged array
        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
    }
}