package Java8.Predicate;

import java.util.function.Predicate;

public class PredicateInterfacePassingInFunction {
    public static void main(String[] args) {
        predicate(10, (i)-> i>70);
    }

    private static void predicate(int i, Predicate<Integer> predicate) {
        System.out.println(predicate.test(i));
    }
}
