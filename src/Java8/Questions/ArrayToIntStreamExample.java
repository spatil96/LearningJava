package Java8.Questions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayToIntStreamExample {
    public static void main(String[] args) {
        // Step 1: Define an array of primitive integers
        int[] numbers = {1, 2, 3, 4, 5};

        // Step 2: Convert the array to an IntStream using Arrays.stream()
        IntStream numberStream = Arrays.stream(numbers);

        // Step 3: Display each element in the stream
        numberStream.forEach(System.out::println);
    }
}