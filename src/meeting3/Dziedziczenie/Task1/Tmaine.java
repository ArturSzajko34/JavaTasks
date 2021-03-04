package meeting3.Dziedziczenie.Task1;

public class Tmaine {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.meow();
        cat.eat();

        Dog dog = new Dog();
        dog.bark();
        dog.eat();

        Cat nygus = (Cat) new Animal();
        nygus.meow();
        nygus.eat();
    }
}
