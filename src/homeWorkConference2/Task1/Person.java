package homeWorkConference2.Task1;

public class Person {
    public int age = 20;

    public void changeAge(int age) {
        this.age = age + 20;
        System.out.println("The age in changeAge() is " + this.age);
    }
}
