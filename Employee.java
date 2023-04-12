package People;

import java.util.Objects;

public class Employee {
    
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee(String firstname, String lastname, int age, double salary) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.age = age;
        this.salary = salary;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Employee employee) {
            return firstName.equals(employee.firstName) || lastName.equals(employee.lastName);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(firstName, lastName, age, salary);
    }

    public String toString() {
        return "Employee[" + getFullName() + ", " + age + ", " + salary + "]";
    }


    public String getFullName() {
        return firstName + " " + lastName;
    }

    public boolean olderThan(Employee anotherEmployee) {
        if (age > anotherEmployee.age) {
            return true;
        }
        return false;
    }

    public void upgrade(double number) {
        salary += number;
        System.out.println(salary);
    }
}