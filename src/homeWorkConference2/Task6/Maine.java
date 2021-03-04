package homeWorkConference2.Task6;
/*
Utwórz klasę Dog z statycznym polem dogCount,która będzie przetrzymywała licznik,ile zostało utworzonych obiektów klasy Dog.
Utwórz w metodzie main kilka obiektów klasy dog iwypisz na konsoli licznik dogCount
 */
public class Maine {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();


        System.out.println(Dog.dogCount);
    }
}
