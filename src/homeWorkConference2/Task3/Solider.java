package homeWorkConference2.Task3;

/*
Stwórz klasę Soldier. Klasa ta powinna zawierać 4 pola: age, weight, strength oraz agility.
Zaimplementujwtej klasie metodę Boolean fight(Soldier anotherSoldier).
Metoda ta powinna zwróćić true jeśli żołnierz wygrał walkę z żołnierzem przekazanym do metody i false w przeciwnym wypadku. Zaprojektuj własny algorytm walki.
 */
public class Solider {

    private int age;
    private int weight;
    private int strength;
    private int agility;
    private int exp;

    public Solider(int age, int weight, int strength, int agility) {
        this.age = age;
        this.weight = weight;
        this.strength = strength;
        this.agility = agility;
        this.exp = age + weight;
    }


    public boolean fightSolder(Solider anotherSoldier) {

        if(this.exp == anotherSoldier.exp){
            if(this.exp  % 2 == 0){
                System.out.println("False");
                return false;
            }
        }
        System.out.println("True");
        return this.exp > anotherSoldier.exp;
    }

}
