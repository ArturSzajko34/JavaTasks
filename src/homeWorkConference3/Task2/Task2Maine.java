package homeWorkConference3.Task2;

import java.util.*;

/*
Utworz klasę Cat z polami: name, colour, hasOwner, isHungry.
Utwórz 5 obiektów Cat i dodaj je do Hashmapy <Cat, String>, gdzie key (klucz w mapie) to imię kota.
 */
public class Task2Maine {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Nygus", "Black",true,true);
        Cat cat2 = new Cat("Jarek", "Blue",true,true);
        Cat cat3 = new Cat("Nygus", "Orange",true,true);
        Cat cat4 = new Cat("Mati", "Brown",true,true);
        Cat cat5 = new Cat("Jaro", "White",true,true);



        Map<Cat, String> catList = new HashMap<>();
        catList.put(cat1,cat1.getName());
        catList.put(cat2,cat1.getName());
        catList.put(cat3,cat1.getName());
        catList.put(cat4,cat1.getName());
        catList.put(cat5,cat1.getName());

        System.out.println(catList);
        System.out.println(catList.get(cat1));

    }
}
