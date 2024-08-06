package Java8.Questions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWord {
    public static void main(String[] args) {
        // Input string
        String input = "Java 8 is great";

        // Splitting the input string into words and processing each word with a stream
        String result = Arrays.stream(input.split(" "))
                              .map(word -> new StringBuilder(word).reverse().toString()) // Reversing each word
                              .collect(Collectors.joining(" ")); // Joining the reversed words back into a string

        // Displaying the result
        System.out.println("Original string: " + input);
        System.out.println("Reversed words: " + result);
    }
}