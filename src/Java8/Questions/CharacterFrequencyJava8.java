package Java8.Questions;

import java.util.Scanner;
import java.util.stream.Collectors;

public class CharacterFrequencyJava8 {
    public static void main(String[] args) {
        // Creating a Scanner object for reading input from the console
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
//        String inputString = scanner.nextLine();
String inputString = "SumeetPatilJavaDeveloper";
        // Closing the scanner
        scanner.close();

        // Converting the input string to a stream and counting the frequency of each character
        inputString.chars() // Convert the String to an IntStream
                .mapToObj(c -> (char) c) // Convert each int in the stream to a char
                .collect(Collectors.groupingBy
                        (c -> c, Collectors.counting())) // Group by character and count them
                .forEach((character, frequency)
                        -> System.out.println(character + ": " + frequency)); // Print each character and its frequency
    }
}