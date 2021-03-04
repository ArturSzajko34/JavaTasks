package homeWorkConference2.Task3;

/*
Stwórz klasę Soldier. Klasa ta powinna zawierać 4 pola: age, weight, strength oraz agility.
Zaimplementuj wtej klasie metodę Booleanfight(Soldier anotherSoldier).
Metoda ta powinna zwróćić true jeśli żołnierz wygrał walkę z żołnierzem przekazanym do metody i false w przeciwnym wypadku.
Zaprojektuj własny algorytm walki.
 */
public class Main {
    public static void main(String[] args) {
        Solider artur = new Solider(100, 200, 50, 4);

        Solider michal = new Solider(100, 100, 1, 40);
        artur.fightSolder(michal);
    }
}
