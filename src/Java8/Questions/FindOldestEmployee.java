package Java8.Questions;

import java.util.*;
import java.util.stream.Collectors;

public class FindOldestEmployee {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai"),
            new Employee(2, "Rahul", 25, 130000, "M", "Engineering", "Bangalore"),
            new Employee(3, "Vishal", 34, 110000, "M", "Engineering", "Mumbai"),
            new Employee(4, "Lakshmi", 45, 150000, "F", "HR", "Bangalore")
        );

        Employee oldest = employees.stream()
                                   .max(Comparator.comparingInt(Employee::getAge))
                                   .orElse(null);

        if (oldest != null) {
            System.out.println("Oldest employee: " + oldest);
        } else {
            System.out.println("No employees found.");
        }
    }
}