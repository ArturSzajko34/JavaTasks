package meeting4.Task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Artur", 40, 5000));
        employeeList.add(new Employee("Sabi", 15, 80000));
        employeeList.add(new Employee("Aleksander", 6, 3000));

        Employee youngestEmployee = employeeList.stream()
                .min(Comparator.comparing(Employee::getAge))
                .get();

        System.out.println(youngestEmployee);

        List<Employee> eldestEmployee = Collections.singletonList(employeeList.stream()
                .max(Comparator.comparing(Employee::getAge))
                .get());

        System.out.println(eldestEmployee);


        List<String> nameList = employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        System.out.println(nameList);


        Employee minSalary = employeeList.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println(minSalary);


        Employee maxSalary  = employeeList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println(maxSalary);


        List<Employee> employee5000AndName = employeeList.stream()
                .filter(employee -> employee.getSalary() > 5000 && employee.getName().equals("Artur"))
                .collect(Collectors.toList());

        System.out.println(employee5000AndName);


        List<Employee> employee5000 = employeeList.stream()
                .filter(employee -> employee.getSalary() > 5000)
                .collect(Collectors.toList());

        System.out.println(employee5000);

        int totalSalary = employeeList.stream().mapToInt(Employee::getSalary).sum();
        System.out.println(totalSalary);

    }
}
