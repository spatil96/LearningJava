package Java8.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortStringsAlphabetically {
    public static void main(String[] args) {
        // Creating a list of strings
        List<String> strings = Arrays.asList("Banana", "Apple", "Orange", "Mango", "Grape");

        // Using Java 8 Streams to sort the list alphabetically
        List<String> sortedStrings = strings.stream() // Converting the list to a stream
                                             .sorted() // Sorting the stream alphabetically
                                             .collect(Collectors.toList()); // Collecting the sorted stream back into a list

        // Displaying the sorted list
        System.out.println("Sorted list of strings:");
        sortedStrings.forEach(System.out::println); // Printing each element of the sorted list
    }
}