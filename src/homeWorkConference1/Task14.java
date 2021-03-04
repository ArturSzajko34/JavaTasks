package homeWorkConference1;

import java.util.Scanner;

public class Task14 {
    /*
    Napisz metodę, która przyjmuje liczbę całkowitą i zwracaliczbę cyfr w podanejliczbie.
    Podaj liczbę:
    91231
    wynik: 5
     */
    public static void main(String[] args) {
        conversionNumberToLength(enterNumber());
    }

    static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        return scanner.nextInt();
    }

    public static void conversionNumberToLength(int number) {
        String value = String.valueOf(number);
        System.out.println("Results: " + value.length());
    }
}
