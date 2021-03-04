package meeting3.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListZadania {
    public static void main(String[] args) {

        //Task1
        List<String> myList = new ArrayList<>();
        myList.add("czerwony");
        myList.add("zielony");
        myList.add("niebieski");
        System.out.println(myList);

        //Task2
        myList.add(0, "brazowy");
        System.out.println(myList);


        //Task3
        System.out.println(myList.get(1) + " " + myList.get(3));

        //Task4
        myList.set(0, "Czerwony");
        System.out.println(myList);

        //Task5
        int value = myList.size() - 1;
        System.out.println(myList.remove(value));

        System.out.println(myList);

        //Task6
        List<String> listString = new ArrayList<>();
        listString.add("Jaro");
        listString.add("Daro");
        listString.add("Mati");

        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);

        sortInt(listInteger);
        sortList(listString);

    }


    public static void sortInt(List<Integer> value) {
        Collections.sort(value);
        System.out.println(value);

    }


    public static void sortList(List<String> string) {
        Collections.sort(string);
        System.out.println(string);

    }
}
