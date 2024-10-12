package Java8.Questions;

import java.util.*;
import java.util.stream.Collectors;

public class FindHighestExperience {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai", 1995),
            new Employee(2, "Rahul", 25, 130000, "M", "Engineering", "Bangalore", 2000),
            new Employee(3, "Vishal", 34, 110000, "M", "Engineering", "Mumbai", 1998),
            new Employee(4, "Lakshmi", 28, 150000, "F", "HR", "Bangalore", 1992),
            new Employee(5, "Priya", 24, 90000, "F", "Marketing", "Delhi", 2005)
        );

        int maxExperience = employees.stream()
                                     .mapToInt(Employee::getExperience)
                                     .max()
                                     .orElse(0);

        List<Employee> mostExperiencedEmployees = employees.stream()
            .filter(e -> e.getExperience() == maxExperience)
            .collect(Collectors.toList());

        mostExperiencedEmployees.forEach(System.out::println);
    }
}