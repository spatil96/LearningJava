package Java8.Questions;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedChar {
    public static void main(String[] args) {
        String input = "javastream"; // The input string

        // Step 1: Convert the string into a stream of characters
        Character result = input.chars() // Creates an IntStream
                .mapToObj(c -> (char) c) // Convert int to Character
                // Step 2: Collect characters to map with occurrence count, preserving order
                .collect(Collectors.toMap(Function.identity(), v -> 1, Integer::sum, LinkedHashMap::new))
                // Step 3: Find the first character with more than one occurrence
                .entrySet().stream().filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst().orElse(null); // Retrieve the first repeated character, if any

        // Step 4: Print the first repeated character
        if (result != null) {
            System.out.println("First repeated character: " + result);
        } else {
            System.out.println("No repeated characters found.");
        }
    }
}