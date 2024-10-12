package Java8.Questions;

import java.util.stream.Stream;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamToMapExample {
    public static void main(String[] args) {
        // Step 1: Create a stream of strings
        Stream<String> fruitStream = Stream.of("Apple", "Banana", "Orange", "Mango");

        // Step 2: Convert the Stream to a Map (key: string, value: length of string)
        Map<String, Integer> fruitMap = fruitStream.collect(Collectors.toMap(
            fruit -> fruit,        // Key: the string itself
            fruit -> fruit.length() // Value: the length of the string
        ));

        // Step 3: Display the Map
        System.out.println(fruitMap);  // Output: {Apple=5, Banana=6, Orange=6, Mango=5}
    }
}