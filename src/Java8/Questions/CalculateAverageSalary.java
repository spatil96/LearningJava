package Java8.Questions;

import java.util.*;
import java.util.stream.Collectors;

public class CalculateAverageSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai"),
            new Employee(2, "Rahul", 25, 130000, "M", "Engineering", "Bangalore"),
            new Employee(3, "Vishal", 34, 110000, "M", "Engineering", "Mumbai"),
            new Employee(4, "Lakshmi", 28, 150000, "F", "HR", "Bangalore"),
            new Employee(5, "Priya", 24, 90000, "F", "Marketing", "Delhi")
        );

        Map<String, Double> averageSalaries = employees.stream()
            .collect(Collectors.groupingBy(Employee::getDeptName,
                                           Collectors.averagingDouble(Employee::getSalary)));

        averageSalaries.forEach((dept, avgSalary) ->
            System.out.println("Department: " + dept + ", Average Salary: " + avgSalary));
    }
}
