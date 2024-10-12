package Java8.Questions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class IteratorToStreamExample {
    public static void main(String[] args) {
        // Step 1: Define a list and create an Iterator
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        Iterator<Integer> iterator = numbers.iterator();

        // Step 2: Convert the Iterator to a Stream
        Stream<Integer> stream = StreamSupport.stream(
            Spliterators.spliteratorUnknownSize(iterator, 0), false);

        // Step 3: Process the Stream (filter even numbers and multiply by 2)
        stream.filter(num -> num % 2 == 0)   // Filter even numbers
              .map(num -> num * 2)           // Multiply even numbers by 2
              .forEach(System.out::println); // Display the result
    }
}