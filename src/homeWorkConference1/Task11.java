package homeWorkConference1;

import java.util.Scanner;

/*
Napisz program, który poprosi użytkownika o podanie roku urodzenia i wyświetli liczbę dni w podanym roku.Uwzględnij rok przestępny(366 dni).
 */
public class Task11 {
    public static void main(String[] args) {

        displayNumberOfDaysInYear(isThereLeapYear(enterYear()));

    }

    public static int enterYear(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birth year: ");
        return scanner.nextInt();
    }

    public static boolean isThereLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0);
    }

    public static void displayNumberOfDaysInYear(boolean isLeapYear) {
        int leapYear = 366;
        int yearNotLeap = 365;

        if (isLeapYear) {
            System.out.println("leap year is " + leapYear + " days");
        } else {
            System.out.println("year not leap is " + yearNotLeap + " days");
        }
    }
}


