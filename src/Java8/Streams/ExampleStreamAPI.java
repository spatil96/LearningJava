package Java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExampleStreamAPI {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sumeet", "Shubham", "Ankit");
        System.out.println("Simple List: "+names);

        //creating a stream from collection
        Stream<String> nameStream = names.stream();
        System.out.println("Name Stream:"+ nameStream.toString());// prints address

        //creating a stream from an array
        String[] namesArray = {"Sumeet", "Shubham", "Ankit"};
        System.out.println("Names Array: "+ Arrays.toString(namesArray));
        Stream<String> namesArrayStream = Arrays.stream(namesArray);
        System.out.println(namesArrayStream);

        //creating a Stream using Stream.of()
        Stream<String> namesOfStream = Stream.of(
                "Sumeet", "Shubham", "Ankit");
        System.out.println(namesOfStream);

        List<String> moreNames = Arrays.asList(
                "Sumeet", "Shubham", "Ankit", "Samsher", "Deeepanjay","jaydeep");

        List<String> filterNames = moreNames.stream()
                .filter(name->name.startsWith("S"))
                .map(name->name.toUpperCase())
                .collect(Collectors.toList());

        System.out.println(filterNames);



    }
}
