package homeWorkConference1;
/*
Napisz metodę printRectagle(int a, int b), która przyjmuje 2 cyfry a i b.
Używając pętli for wydrukuj prostokąt o wymiarach a x b stworzony z zer.
printRectagle(5, 7)

000
000
000
 */

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        int width = enterNumber("enter width");
        int length = enterNumber("enter length");
        printRectagle(width, length);

    }

    public static void printRectagle(int a, int b) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }

    public static int enterNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}
