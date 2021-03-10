package meeting4.rzutowanie.Task2;

public class Maine {
    public static void main(String[] args) {

        Dog dog = new Dog("Gufi");
        Cat cat = new Cat("Nygus");
        Animal animal = new Cat("Nygus");

        dog.bitePostman();
        cat.bitePostman();

    }

    private static void bitePostman(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        }

    }
}
