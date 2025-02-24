package Java8.Questions;

import java.util.Arrays;
import java.util.List;
import Java8.Questions.Employee;
public class EmployeeSortingExample {
    public static void main(String[] args) {
        // Create a list of Employee objects
        List<Employee> employees = Arrays.asList(
            new Employee("Rahul", 55000),
            new Employee("Anjali", 60000),
            new Employee("Rajesh", 45000),
            new Employee("Priya", 70000)
        );

        // Step 3: Sort the list by salary
//        employees.sort((e1, e2) -> Integer.compare((int) e1.getSalary(), (int) e2.getSalary()));
        employees.sort((e1, e2) -> Integer.compare((int) e1.getAge(), (int) e2.getAge()));
        // Step 4: Display the sorted list
        System.out.println("Employees sorted by salary:");
        employees.forEach(System.out::println);
    }
}