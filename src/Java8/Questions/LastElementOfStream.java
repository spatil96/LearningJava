package Java8.Questions;

import java.util.Arrays;
import java.util.List;

public class LastElementOfStream {
    public static void main(String[] args) {
        // Step 1: Define a list and create a Stream
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        // Step 2: Convert the Stream to a List and get the last element
        Integer lastElement = numbers.stream()
                                     .reduce((first, second) -> second)  // Reduce to get last element
                                     .orElse(null);  // Handle case where stream is empty

        // Step 3: Display the last element
        System.out.println("Last element: " + lastElement);
    }
}