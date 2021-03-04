package homeWorkConference3.Task4;

/*
Dodaj 5 różnych elementów do HashMap<String, String>. Wyświetl listę keys (kluczy).
 */

import java.util.HashMap;

public class Task4 {
    public static void main(String[] args) {

        HashMap<String, String> valueZiomki = new HashMap<>();
        valueZiomki.put("Artur", "Wołomin");
        valueZiomki.put("Jaro", "Warszawa");
        valueZiomki.put("Daro", "Kobyłka");
        valueZiomki.put("Mati", "Zielonka");
        valueZiomki.put("Seba", "Zakopane");

        System.out.println(valueZiomki);

        for (String value : valueZiomki.keySet()) {
            System.out.println(value);
        }
    }
}
