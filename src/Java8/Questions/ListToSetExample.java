package Java8.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListToSetExample {
    public static void main(String[] args) {
        // Step 1: Define the List of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 3, 2);

        // Step 2: Convert the List to a Stream and collect to a Set
        Set<Integer> numberSet = numbers.stream()
                                        .collect(Collectors.toSet());

        // Step 3: Display the Set
        System.out.println(numberSet);  // Output: [1, 2, 3, 4, 5]
    }
}