package Java8.Questions;

import java.util.stream.Stream;
import java.util.Set;
import java.util.stream.Collectors;
//: Convert Stream of Integers to a Set
public class StreamToSetExample {
    public static void main(String[] args) {
        // Step 1: Create a stream of integers
        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5, 3, 2);

        // Step 2: Convert the stream to a set
        Set<Integer> numberSet = numberStream.collect(Collectors.toSet());

        // Step 3: Display the set
        System.out.println(numberSet);  // Output: [1, 2, 3, 4, 5]
    }
}