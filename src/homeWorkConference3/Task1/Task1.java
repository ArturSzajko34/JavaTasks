package homeWorkConference3.Task1;

import java.util.ArrayList;
import java.util.List;

/*
Napisz metodę, która jako parametry przyjmuje listę Stringów i int n i zwraca listę Stringów.
Niech metoda pobierze ostatni element z listy i doda go na początek listy n-razy.
Wyświetl wynik działania metody.
 */
public class Task1 {
    public static void main(String[] args) {

        List<String> myListOfColors = new ArrayList<>();
        myListOfColors.add("Jaro");
        myListOfColors.add("Daro");
        myListOfColors.add("Mati");

        System.out.println(getLastElementInListAndSetsFirst(myListOfColors, 2));
    }

    public static List<String> getLastElementInListAndSetsFirst(List<String> myList, int iteration) {
        String lastElementFromList = myList.get(myList.size() - 1);
        myList.remove(lastElementFromList);

        for (int i = 0; i < iteration; i++) {
            myList.add(0, lastElementFromList);
        }
        return myList;
    }
}
