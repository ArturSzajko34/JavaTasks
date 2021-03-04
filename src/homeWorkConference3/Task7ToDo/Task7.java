package homeWorkConference3.Task7ToDo;
/*
Napisz metodę, która pobierze Map<String, String> jako parametr.
W ramach metody usuń elementy z takimi samymi wartościami (values) i zwróć mapę.
Input: {Jan=Nowak, Marian=Nowak, Grażyna=Torbicka}Output: {Grażyna=Torbicka}
 */

import java.util.*;

public class Task7 {
    public static void main(String[] args) {

        Map<String, String> namesAndSurname = new HashMap<>();
        namesAndSurname.put("Artur", "Szako");
        namesAndSurname.put("Sabina", "Oska");
        namesAndSurname.put("Damian", "Szajko");
        namesAndSurname.put("Sylwia", "Szajko");

        removeDuplicateValue(namesAndSurname);


    }

    public static void removeDuplicateValue(Map<String, String> map) {
//
//        List<String> lista = new ArrayList<>();
//
//        String value = "";
//        String value1 = "";
//
//        for (String name : map.values()) {
//            lista.add(name);
//        }
//
//        for (int i = 0; i < lista.size(); i++) {
//            value = lista.get(i);
//            for (int j = 1; j < lista.size(); j++) {
//                value1 = lista.get(j);
//                if (value.equals(value1)) {
//                    System.out.println(value);
//                }
//                //przeiterowac po mapie i sprawdzić sobie klucz dla wartości
//            }
//        }
//
//        for (String test : map.keySet()) {
//            if (map.get(test).equals(value1)) {
//                map.remove(test, value1);
//            }
//        }
//        System.out.println(map);
//
//
//
//        }

        String ex ="";
        for(String value : map.values()){
            for(String value1: map.values()){
                if (value.equals(value1)) {
                    ex = value1;
                }
            }

        }
        System.out.println(ex);



    }
}





