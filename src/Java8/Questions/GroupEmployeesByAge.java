package Java8.Questions;
import java.util.*;
import java.util.stream.Collectors;



// File: GroupEmployee1sByAge.java


public class GroupEmployeesByAge {
    public static void main(String[] args) {
        List<Employee1> Employee1s = Arrays.asList(
            new Employee1(1, "Aditi", 30, 100000, "F", "HR", "Mumbai"),
            new Employee1(2, "Rahul", 34, 130000, "M", "Tech", "Bangalore"),
            new Employee1(3, "Vishal", 34, 110000, "M", "Tech", "Mumbai"),
            new Employee1(4, "Lakshmi", 45, 150000, "F", "HR", "Bangalore")
        );

        Map<Integer, List<Employee1>> groupedByAge = Employee1s.stream()
            .collect(Collectors.groupingBy(Employee1::getAge));

        groupedByAge.forEach((age, empList) -> {
            System.out.println("Age: " + age);
            empList.forEach(System.out::println);
        });
    }
}
     class Employee1 {
        private int id;
        private String name;
        private int age;
        private long salary;
        private String gender;
        private String deptName;
        private String city;

        public Employee1(int id, String name, int age, long salary, String gender, String deptName, String city) {
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

        @Override
        public String toString() {
            return String.format("ID: %d, Name: %s, Age: %d, Salary: %d, Gender: %s, Department: %s, City: %s",
                    id, name, age, salary, gender, deptName, city);
        }
    }
