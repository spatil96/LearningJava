package Java8.Predicate;

import java.util.function.Consumer;
import java.util.function.Predicate;

public class ExamplePredicate {
    public static void main(String[] args) {
        Predicate<String> largerThan5= s->s.length()>5;
        boolean result = largerThan5.test("hello");
        boolean result1 = largerThan5.test("Sumeet");
        System.out.println(result);
        System.out.println(result1);

        Consumer<String> toUpperCase = s-> System.out.println(s.toUpperCase());
        toUpperCase.accept("sumeet patil");

        doSomething(largerThan5);
        doSomething(s ->s.startsWith("A"));
        doSomething(s ->s.startsWith("d")); //case sensitive

    }
    public static void doSomething(Predicate<String> p){
        System.out.println(p.test("doSomething"));
    }}
