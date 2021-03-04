package homeWorkConference1;

import java.util.Scanner;

/*
Napisz program, który poprosi użytkownika o podanie liczby oznaczającej dzień tygodnia.
W zależności od podanej liczby wyświetl nazwę dnia tygodnia.
Przyjmijmy, źe tydzień zaczyna się od poniedziałku.
Jeśli użytkownik poda liczbę większą niż 7, wyświetl napis „No such day!".
 */
public class Task9 {
    public static void main(String[] args) {
        displayDayOfTheWeek();
    }

    public static void displayDayOfTheWeek() {
        int numberOfDay = enterNumberOfTheWeek();

        switch (numberOfDay) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("No such day!");
        }


    }

    public static int enterNumberOfTheWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of week:");
        return scanner.nextInt();
    }

}
