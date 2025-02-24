package Java8.Questions;

import javax.xml.stream.events.Characters;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        //Merge arrays of char Stream
        // Merge using IntStream and convert back to char[]
        char[] c1= {'c','h','a','r'};
        char[] c2= {'a','b','c','d'};
        char[] mergedCharArray = IntStream.concat(
                        IntStream.range(0, c1.length).map(i -> c1[i]),  // Convert char[] to IntStream
                        IntStream.range(0, c2.length).map(i -> c2[i])
                ).mapToObj(c -> (char) c)  // Convert int back to char
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString().toCharArray();  // Convert StringBuilder to char[]

        // Display the merged char array
        System.out.println("Merged Char Array: " + Arrays.toString(mergedCharArray));
    }
}