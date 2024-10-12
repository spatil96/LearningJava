package Java8.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortListWithStream {
    public static void main(String[] args) {
        // Step 1: Define the List of integers
        List<Integer> numbers = Arrays.asList(5, 1, 4, 2, 3);

        // Step 2: Convert the List to a Stream and sort in natural order
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()  // Step 3: Sort in natural order
                                             .collect(Collectors.toList());  // Step 4: Collect back to List

        // Step 5: Display the sorted List
        System.out.println(sortedNumbers);  // Output: [1, 2, 3, 4, 5]
    }
}