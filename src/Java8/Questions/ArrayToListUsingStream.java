package Java8.Questions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayToListUsingStream {
    public static void main(String[] args) {
        // Step 1: Define the array of strings
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};

        // Step 2: Convert the array to a Stream and collect to a List
        List<String> fruitList = Arrays.stream(fruits)
                                       .collect(Collectors.toList());

        // Step 3: Display the List
        System.out.println(fruitList);
    }
}