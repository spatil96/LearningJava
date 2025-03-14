package Java8.Questions;

import java.util.*;

public class FindMaxAge {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee(1, "Aditi", 30, 100000, "F", "HR", "Mumbai"),
            new Employee(2, "Rahul", 25, 130000, "M", "Tech", "Bangalore"),
            new Employee(3, "Vishal", 34, 110000, "M", "Tech", "Mumbai"),
            new Employee(4, "Lakshmi", 45, 150000, "F", "HR", "Bangalore")
        );

        Optional<Integer> maxAge = employees.stream()
                                            .map(Employee::getAge)
                                            .max(Integer::compare);

        maxAge.ifPresent(age -> System.out.println("Maximum Age: " + age));
    }
    private static class Employee {
        private int id;
        private String name;
        private int age;
        private long salary;
        private String gender;
        private String deptName;
        private String city;

        public Employee(int id, String name, int age, long salary, String gender, String deptName, String city) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.gender = gender;
            this.deptName = deptName;
            this.city = city;
        }

        public int getAge() {
            return age;
        }
    }
}