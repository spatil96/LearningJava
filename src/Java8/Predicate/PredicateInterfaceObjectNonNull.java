package Java8.Predicate;

import java.util.Objects;
import java.util.function.Predicate;

public class PredicateInterfaceObjectNonNull {
    public static void main(String[] args) {
        Predicate<String> isNonNull = Objects::nonNull;
        Predicate<String> length = i -> i.length() > 8;
        Predicate<String> length1 = i -> i.length() < 8;
        String str = "This is a test String";
        System.out.println(isNonNull.and(length).or(length1).test(str));
    }
}
