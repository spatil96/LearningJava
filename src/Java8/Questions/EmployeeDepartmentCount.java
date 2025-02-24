package Java8.Questions;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeDepartmentCount {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai"),
            new Employee(2, "Rahul", 25, 130000, "M", "Engineering", "Bangalore"),
            new Employee(3, "Vishal", 34, 110000, "M", "Engineering", "Mumbai"),
            new Employee(4, "Lakshmi", 45, 150000, "F", "HR", "Bangalore")
        );

        Map<String, Long> departmentCount = employees.stream()
                                                     .collect(Collectors.groupingBy
                                                             (Employee::getDeptName, Collectors.counting()));

        departmentCount.forEach((deptName, count) ->
                System.out.println("Department: " + deptName + ", Number of Employees: " + count));
    }
}
