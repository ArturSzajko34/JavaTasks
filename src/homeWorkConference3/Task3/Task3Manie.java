package homeWorkConference3.Task3;
/*
Napisz metodę, która jako parametr przyjmuje listę Stringów i zwróci listę ze zdublowanymi wartościami.
Input: “uno”, “dos”, “tres
”Output: “uno”, “uno”, “dos”, “dos”, “tres”, “tres”;
 */


import java.util.ArrayList;
import java.util.List;

public class Task3Manie {
    public static void main(String[] args) {

        List<String> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(0, "unos");
        listOfAnimals.add(1, "dos");
        listOfAnimals.add(2, "tres");

        System.out.println(duplicateValues(listOfAnimals));
    }

    public static List<String> duplicateValues(List<String> myList) {

        List<String> newList = new ArrayList<>();

        for (int i = 0; i < myList.size(); i++) {
            String value = myList.get(i);
            newList.add(value);
            newList.add(value);
            }
        return newList;
    }
}
