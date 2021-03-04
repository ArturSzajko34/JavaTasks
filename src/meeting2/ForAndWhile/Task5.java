package meeting2.ForAndWhile;

import java.util.Random;
import java.util.Scanner;

/*
Zaimplementuj grę. Pobierz losową liczbę (0–100) i powiedz użytkownikowi, aby ją odgadł.
Jeśli jest większa, powiedz „za duża”, jeśli jest mniejsza, powiedz „za mała”.
Zakończ program, gdy odgadnięta liczba jest poprawna. Drukuj „dobrze!” i numer. Którą pętlę byś wybrał?
 */

//Zadanie można było rozwiązać doWhile
public class Task5 {
    public static void main(String[] args) {

        int randomValue = generateRandomNumbers();


        while (true) {
            if (!verificationNumber(getNumber(), randomValue)) {
                break;
            }
        }
    }


    public static int generateRandomNumbers() {
        Random random = new Random();
        int value = random.nextInt(100);
        return value;
    }

    public static int getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 0 to 100");
        return scanner.nextInt();
    }

    public static boolean verificationNumber(int number, int randomValue) {

        if (number < randomValue) {
            System.out.println("number to small");
            return true;
        } else if (number > randomValue) {
            System.out.println("number to large");
            return true;
        } else {
            System.out.println("You win");
            return false;
        }


    }
}
