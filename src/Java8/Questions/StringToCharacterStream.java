package Java8.Questions;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StringToCharacterStream {
    public static void main(String[] args) {
        // Step 1: Define the input string
        String input = "Hello, World!";

        // Step 2: Convert the string to an IntStream of character codes
        IntStream charStream = input.chars();

        // Step 3: Convert the IntStream to a Stream of Characters
        Stream<Character> characterStream = charStream.mapToObj(c -> (char) c);

        // Step 4: Display each character in the stream
        characterStream.forEach(System.out::println);
    }
}