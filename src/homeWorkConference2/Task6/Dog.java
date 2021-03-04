package homeWorkConference2.Task6;
/*
Utwórz klasę Dog z statycznym polem dogCount,która będzie przetrzymywała licznik,ile zostało utworzonych obiektów klasy
Dog.Utwórz w metodzie main kilka obiektów klasy dog iwypisz na konsoli licznik dogCount
 */
public class Dog {

    public static int dogCount;


    public Dog() {
        dogCount ++;
    }
}
