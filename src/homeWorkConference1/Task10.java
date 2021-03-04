package homeWorkConference1;

import java.util.Scanner;

/*
Napisz program, który poprosi użytkownika o podanie dowolnej liczby całkowitej.
Jeśli liczba jest ujemna podnieś ją do kwadratu.
Jeśli podana liczba wynosi 0, nie zmieniaj jej.Wydrukuj wynik na konsolidla liczb: -100, 1, 0,-1,300002
 */
public class Task10 {
    public static void main(String[] args) {
        numberConversion(-100);
        numberConversion(1);
        numberConversion(0);
        numberConversion(-1);
        numberConversion(300002);
    }

    public static void numberConversion(int number) {
        if (number < 0) {
            System.out.println(number * number);

        } else if (number == 0) {
            System.out.println(number);
        } else {
            System.out.println("no discourse");
        }
    }
}


