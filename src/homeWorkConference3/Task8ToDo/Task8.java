package homeWorkConference3.Task8ToDo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Stwórz listę Stringów. Użyj klawiatury, by wprowadzić 5 Stringów i dodaj je do listy.
Następnie znajdź najdłuższy String w liście i wyświetl go.Jeśli jest więcej niż 1 najdłuższy String,
wyświetl wszystkie.
 */
public class Task8 {
    public static void main(String[] args) {

        List<String> listString = new ArrayList<>();

        enterValueFromList(listString);
        findTheLongest(listString);



    }

    public static void findTheLongest(List<String> list) {

        List<Integer> length = new ArrayList<>();



        //dodatkowa zmienna do które porównam wartosc kolejnej wartości

        for (String value: list){
          int lengthValue = value.length();
          length.add(lengthValue);
        }

        System.out.println(length);
    }


    public static List<String> enterValueFromList(List<String> list) {

        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter value " + i);
            String value = scanner.nextLine();
            list.add(value);
        }
        return list;
    }
}
