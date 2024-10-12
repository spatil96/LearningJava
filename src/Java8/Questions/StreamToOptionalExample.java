package Java8.Questions;

import java.util.Optional;
import java.util.stream.Stream;

public class StreamToOptionalExample {
    public static void main(String[] args) {
        // Step 1: Create a stream of integers
        Stream<Integer> numberStream = Stream.of(1, 2, 3, 4, 5);

        // Step 2: Convert the stream to an Optional using findFirst()
        Optional<Integer> firstNumber = numberStream.findFirst();

        // Step 3: Display the Optional result
        firstNumber.ifPresentOrElse(
            num -> System.out.println("First element: " + num),
            () -> System.out.println("No element found")
        );
    }
}