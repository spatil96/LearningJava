package Basics.Collections.ListInterface;

import java.util.*;

public class TreeSetCustomComparator {
    public static void main(String[] args) {
//        SortedSet<String> weekDays = new TreeSet<>(Comparator.reverseOrder());
//// Adding new elements to a TreeSet
//        weekDays.add("Monday");
//        weekDays.add("Tuesday");
//        weekDays.add("Wednesday");
//        weekDays.add("Thursday ");
//        weekDays.add("Friday ");
//        weekDays.add("Saturday  ");
//        weekDays.add("Sunday");
//
//        System.out.println("weekDays Set : " + weekDays);
//        weekDays Set : [Wednesday, Tuesday, Thursday , Sunday, Saturday  , Monday, Friday ]

//        SortedSet<String> weekDays = new TreeSet<>(String.CASE_INSENSITIVE_ORDER);
//// Adding new elements to a TreeSet
//        weekDays.add("Monday");
//        weekDays.add("Tuesday");
//        weekDays.add("Wednesday");
//        weekDays.add("Thursday ");
//        weekDays.add("Friday ");
//        weekDays.add("Saturday  ");
//        weekDays.add("Sunday");
//
//        System.out.println("weekDays Set : " + weekDays);
//
//// Now, lowercase elements will also be considered as duplicates
//        weekDays.add("sunday");
//        System.out.println("After adding \"sunday\" : " + weekDays);
//        weekDays Set : [Friday , Monday, Saturday  , Sunday, Thursday , Tuesday, Wednesday]
//        After adding "sunday" : [Friday , Monday, Saturday  , Sunday, Thursday , Tuesday, Wednesday]

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Orange");
        treeSet.add("Apple");
        treeSet.add("Banana");

        // 1. Using Iterator
        System.out.println("Iterating with Iterator:");
        Iterator<String> iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        // 2. Using Enhanced for-loop
        System.out.println("\nIterating with Enhanced for-loop:");
        for (String fruit : treeSet) {
            System.out.println(fruit);
        }

        // 3. Using Java 8 forEach with lambda
        System.out.println("\nIterating with Java 8 forEach and lambda:");
        treeSet.forEach(fruit -> System.out.println(fruit));

        // 4. Using Java 8 Stream API
        System.out.println("\nIterating with Java 8 Stream API:");
        treeSet.stream().forEach(System.out::println);

        TreeSet<Person> people = new TreeSet<>();
        people.add(new Person("John", 25));
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 20));

        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println("Modulo Function");
        System.out.println(20%10);//0
        System.out.println(10%20);//10
        System.out.println("And Operation");
        System.out.println(20&10);//0
        System.out.println(10&20);//00
        int a=15;
        int b=10;
        System.out.println(b|a);
    }
}
class Person implements Comparable<Person>{
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name); // comparing based on name
    }

    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
