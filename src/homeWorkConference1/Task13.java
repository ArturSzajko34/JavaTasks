package homeWorkConference1;

import java.util.Scanner;

/*
Napiszprogram, który poprosi użytkownika o podanie liczby całkowitej.
Wyświetl informację, czyliczba jest:
-dodatnia
-ujemna
-parzysta
nieparzysta
-równa 0
-niech program kończy swoje działanie,
gdy użytkownik wpisze liczbę 9999
 */
public class Task13 {
    public static void main(String[] args) {

        while (true) {
            int number = enterNumber();
            if (number == 9999) {
                System.out.println("apliication end");
                break;
            }
            verificationNumber(number);
        }

    }

    public static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter integer: ");
        return scanner.nextInt();
    }

    public static void checkAndDisplayIfNumberIsEven(int number) {
        if (number % 2 == 0) {
            System.out.print("the number is even, ");
        } else {
            System.out.print("the number isn't even, ");
        }
    }

    public static void isPositiveNumber(int number) {
        if (number > 0) {
            System.out.println("positive number");
        } else {
            System.out.println("a negative number");
        }
    }


    public static void verificationNumber(int number) {
        if (number == 0) {
            System.out.print("zero");
        } else {
            checkAndDisplayIfNumberIsEven(number);
            isPositiveNumber(number);
        }
    }
}

