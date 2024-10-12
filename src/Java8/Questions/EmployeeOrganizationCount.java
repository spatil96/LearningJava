package Java8.Questions;

import java.util.Arrays;
import java.util.List;

public class EmployeeOrganizationCount {

    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Rahul Gupta", "Male", "Infosys"),
                new Employee("Priya Patil", "Female", "Infosys"),
                new Employee("Amit Raj", "Male", "TCS"),
                new Employee("Deepika Sharma", "Female", "TCS"),
                new Employee("Vijay Kumar", "Male", "Infosys")
        );

        long malesInInfosys = employees.stream()
                .filter(e -> "Male".equals(e.getGender()) && "Infosys".equals(e.getOrganization()))
                .count();
        long femalesInInfosys = employees.stream()
                .filter(e -> "Female".equals(e.getGender()) && "Infosys".equals(e.getOrganization()))
                .count();
        long malesInTCS = employees.stream()
                .filter(e -> "Male".equals(e.getGender()) && "TCS".equals(e.getOrganization()))
                .count();
        long femalesInTCS = employees.stream()
                .filter(e -> "Female".equals(e.getGender()) && "TCS".equals(e.getOrganization()))
                .count();

        System.out.println("Male employees in Infosys: " + malesInInfosys);
        System.out.println("Female employees in Infosys: " + femalesInInfosys);
        System.out.println("Male employees in TCS: " + malesInTCS);
        System.out.println("Female employees in TCS: " + femalesInTCS);
    }


    private static class Employee {
        private String name;
        private String gender;
        private String organization;

        Employee(String name, String gender, String organization) {
            this.name = name;
            this.gender = gender;
            this.organization = organization;
        }

        public String getGender() {
            return gender;
        }

        public String getOrganization() {
            return organization;
        }
    }
}