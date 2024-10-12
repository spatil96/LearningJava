package Java8.Questions;
import java.util.*;
public class DepartmentPrinter {

    static class Employee1 {
        String name;
        int age;
        String gender;
        String department;
        String organization;

        Employee1(String name, int age, String gender, String department, String organization) {
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.department = department;
            this.organization = organization;
        }

        public String getDepartment() {
            return department;
        }
    }

    public static void main(String[] args) {
        List<Employee1> Employee1s = Arrays.asList(
            new Employee1("Amit Singh", 34, "Male", "Finance", "Infosys"),
            new Employee1("Deepa Patil", 29, "Female", "IT", "TCS"),
            new Employee1("Rajesh Kumar", 42, "Male", "Finance", "Infosys"),
            new Employee1("Lalitha Bhatt", 28, "Female", "HR", "Wipro"),
            new Employee1("Suresh Raina", 30, "Male", "IT", "TCS"),
            new Employee1("Gita Saxena", 31, "Female", "Marketing", "Infosys")
        );

        Employee1s.stream()
                 .map(Employee1::getDepartment)
                 .distinct()
                 .forEach(System.out::println);
    }
}