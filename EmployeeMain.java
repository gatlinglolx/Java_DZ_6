package People;

import java.util.*;
public class EmployeeMain {
    public static void main(String[] args) {
        Set<Employee> hashSet = new HashSet<>();
        Employee e1 = new Employee("Vlad", "Shakhov", 23, 1000);
        Employee e2 = new Employee("Ivan", "Pupkin", 29, 800);
        Employee e3 = new Employee("Alex", "Usov", 25, 1200);
        Employee e4 = new Employee("Andrew", "Usov", 24, 1100);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
        System.out.println(e3.toString());
        System.out.println(e4.toString());
        hashSet.add(e1);
        hashSet.add(e2);
        hashSet.add(e3);
        hashSet.add(e4);
        System.out.println(hashSet);
        System.out.println(e1.getFullName());
        System.out.println(e1.equals(e2));
        System.out.println(e3.equals(e4));
        System.out.println(e1.olderThan(e2));
        System.out.println(e3.olderThan(e4));
        e1.upgrade(200);
    }
}
