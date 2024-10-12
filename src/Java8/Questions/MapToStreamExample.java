package Java8.Questions;

import java.util.HashMap;
import java.util.Map;
//Convert Map Entries to Stream
public class MapToStreamExample {
    public static void main(String[] args) {
        // Step 1: Define a Map
        Map<String, Integer> employeeAges = new HashMap<>();
        employeeAges.put("Ravi", 30);
        employeeAges.put("Amit", 25);
        employeeAges.put("Pooja", 35);

        // Step 2: Convert the Map's entries to a Stream
        employeeAges.entrySet().stream()
                    // Step 3: Process the stream (Print key and value)
                    .forEach(entry -> System.out.println("Name: " + entry.getKey() + ", Age: " + entry.getValue()));
    }
}