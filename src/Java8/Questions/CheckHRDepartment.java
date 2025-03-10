package Java8.Questions;

import java.util.*;

public class CheckHRDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai"),
            new Employee(2, "Rahul", 25, 130000, "M", "Engineering", "Bangalore"),
            new Employee(3, "Vishal", 34, 110000, "M", "Engineering", "Mumbai"),
            new Employee(4, "Lakshmi", 28, 150000, "F", "HR", "Bangalore"),
            new Employee(5, "Priya", 24, 90000, "F", "Marketing", "Delhi")
        );

        boolean hasHREmployees = employees.stream()
                                          .anyMatch(e -> "HR".equals(e.getDeptName()));

        System.out.println("Are there any HR department employees? " + (hasHREmployees ? "Yes" : "No"));
    }
}
