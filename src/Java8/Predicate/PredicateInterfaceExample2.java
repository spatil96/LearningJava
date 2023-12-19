package Java8.Predicate;

import java.util.function.Predicate;

public class PredicateInterfaceExample2 {
    public static void main(String[] args) {
        Predicate<Integer> isLessThan = i -> (i<18);
        Predicate<Integer> isMoreThan = i -> (i>=10);
        System.out.println(isMoreThan.and(isLessThan).test(11));
        System.out.println(isMoreThan.and(isLessThan).negate().test(11));
        System.out.print(isMoreThan.or(isLessThan).test(5));
    }
}
