package homeWorkConference2.Task1;
/*
Napraw błąd w poniższym kodzie, tak aby poprawnie zmienił się wiek osoby.
 */
public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println("Age: " + person.age);
        person.changeAge(person.age);
        System.out.println("New age: " + person.age);

    }
}

