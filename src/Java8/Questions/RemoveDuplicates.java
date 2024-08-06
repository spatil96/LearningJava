package Java8.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Creating a list with duplicates
        List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 10);

        // Printing the original list
        System.out.println("Original list with duplicates: " + numbersWithDuplicates);

        // Removing duplicates using Stream API
        List<Integer> numbersWithoutDuplicates = numbersWithDuplicates.stream()
                                                                      .distinct() // Removing duplicates
                                                                      .collect(Collectors.toList()); // Collecting results into a list

        // Printing the list without duplicates
        System.out.println("List without duplicates: " + numbersWithoutDuplicates);
    }
}