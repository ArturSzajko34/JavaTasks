package homeWorkConference1;

import java.util.Scanner;

public class Task8 {
    /*
    Napisz program, który poprosi użytkownika o podanie liczby i imienia, a następnie wyświetli na konsoli napis:
    <podane imię> will be a java developerin <podana liczba> months!
     */
    public static void main(String[] args) {
        displayInscription();
    }

    public static void displayInscription() {
        String name = enterName();
        int numberOfMonths = enterNumber();
        System.out.println(name + " will be a java developer in: " + numberOfMonths + " months!");
    }

    static int enterNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        return scanner.nextInt();
    }

    static String enterName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name:");
        return scanner.nextLine();
    }

}
