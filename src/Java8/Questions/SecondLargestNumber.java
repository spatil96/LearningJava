package Java8.Questions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondLargestNumber {
    public static void main(String[] args) {
        // Creating a list of integers
        List<Integer> numbers = Arrays.asList(1, 3, 4, 5, 6, 6, 7, 2);

        // Finding the second largest number using Stream API
        Optional<Integer> secondLargest = numbers.stream()
                .distinct() // Remove duplicates
                .sorted(Comparator.reverseOrder()) // Sort the stream in descending order
                .skip(1) // Skip the largest number
                .findFirst(); // Find the second largest number

        // Displaying the second largest number
        secondLargest.ifPresent(number -> System.out.println("Second Largest Number: " + number));
    }
}