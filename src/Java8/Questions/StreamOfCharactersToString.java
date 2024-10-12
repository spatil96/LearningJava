package Java8.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamOfCharactersToString {
    public static void main(String[] args) {
        // Step 1: Define a List of Characters
        List<Character> charList = Arrays.asList('H', 'e', 'l', 'l', 'o', ',', ' ', 'W', 'o', 'r', 'l', 'd', '!');

        // Step 2: Convert the Stream of Characters to a String
        String result = charList.stream()
                                .map(String::valueOf)  // Convert each Character to String
                                .collect(Collectors.joining());  // Join them together

        // Step 3: Display the result
        System.out.println(result);
    }
}