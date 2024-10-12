package Java8.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.stream.Collectors;

public class FindDuplicatesInStream {
    public static void main(String[] args) {
        // Step 1: Define the input list and create a Stream
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 2, 6, 7, 2, 4);

        // Step 2-3: Use a Set to track seen elements and filter duplicates
        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = numbers.stream()
            .filter(n -> !seen.add(n))  // Add element to Set and check if it's already there
            .collect(Collectors.toList());  // Collect duplicates into a List

        // Step 4: Display the duplicates
        System.out.println("Duplicate elements: " + duplicates);
    }
}