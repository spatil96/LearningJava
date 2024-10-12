package Java8.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListToSingleStringExample {
    public static void main(String[] args) {
        // Step 1: Define the List of Strings
        List<String> words = Arrays.asList("Java", "is", "awesome");

        // Step 2: Convert the List to a Stream and concatenate without a delimiter
        String result = words.stream()
                             .collect(Collectors.joining());

        // Step 3: Display the Result
        System.out.println(result);
    }
}