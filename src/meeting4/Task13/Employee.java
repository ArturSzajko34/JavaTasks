package meeting4.Task13;

public class Employee {

    private final String name;
    private final int age;
    private final int salary;

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return name + " ma " + age + " lat." + salary + " zarabia";    }

}
