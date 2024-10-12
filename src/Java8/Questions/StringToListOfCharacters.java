package Java8.Questions;

import java.util.List;
import java.util.stream.Collectors;

public class StringToListOfCharacters {
    public static void main(String[] args) {
        // Step 1: Define the input string
        String input = "Hello, World!";

        // Step 2-4: Convert the string to a list of characters using Stream API
        List<Character> charList = input.chars()            // Convert string to IntStream
                                        .mapToObj(c -> (char) c) // Map each int to Character
                                        .collect(Collectors.toList()); // Collect to List

        // Display the result
        System.out.println(charList);
    }
}