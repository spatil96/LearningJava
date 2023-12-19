package Java8.Predicate;

import java.util.function.Predicate;

public class PredicateInterfaceExample1 {
    public static void main(String[] args) {
        Predicate<Integer> isLess = i -> (i<18);
        System.out.println(isLess.test(6));
        System.out.print(isLess.test(20));
    }
}
