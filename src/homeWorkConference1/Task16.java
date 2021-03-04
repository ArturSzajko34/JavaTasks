package homeWorkConference1;

import jdk.jshell.spi.ExecutionControl;

import java.util.Scanner;

/*
Napisz program, który przyjmuje 4 parametry. Imię, rok, miesiąc i dzień.
Następnie wydrukuj dane zgodnie ze wzorem:
printUserInfo(String name, int year, int month, int day) >
“My name is {name}, I was born on day/month/year.”
 */
public class Task16 {
    public static void main(String[] args) {
        printUserInfo("Artur", 1987, 1, 2);
        printUserInfo("Artur", 1987, 12, 24);
    }

    public static void printUserInfo(String name, int year, int month, int day) {
        String monthConvert = String.format("%02d", month);
        String dayConvert = String.format("%02d", day);
        System.out.println("My name is " + name + ", I was born on " + year + "/" + monthConvert + "/" + dayConvert);
    }
}
