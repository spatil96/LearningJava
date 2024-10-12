package Java8.Questions;

import java.util.Arrays;
import java.util.stream.Stream;

public class ArrayToStreamUsingArraysStream {
    public static void main(String[] args) {
        // Step 1: Define the array of strings
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};

        // Step 2: Convert the array to a stream using Arrays.stream()
        Stream<String> fruitStream = Arrays.stream(fruits);

        // Step 3: Process and display each element in the stream
        fruitStream.forEach(System.out::println);
    }
}