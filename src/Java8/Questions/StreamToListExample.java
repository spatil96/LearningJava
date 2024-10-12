package Java8.Questions;

import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;
// Convert Stream of Integers to a List
public class StreamToListExample {
    public static void main(String[] args) {
        // Step 1: Create a stream of integers
        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);

        // Step 2: Convert the stream to a list
        List<Integer> numberList = numberStream.collect(Collectors.toList());

        // Step 3: Display the list
        System.out.println(numberList);  // Output: [1, 2, 3, 4, 5]
    }
}