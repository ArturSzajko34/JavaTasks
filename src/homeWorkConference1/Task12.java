package homeWorkConference1;

import java.util.Scanner;

/*
Napisz program, który poprosi użytkownika o podanie 3 liczb:a, b, i c.
Następnie sprawdź, czy da się utworzyć trójkąt o podanych długościach boków.
Wydrukuj:
"The triangle is possible." –jeśli da się utworzyć taki trojkąt.
"The triangle is not possible." –jeśli nie da się utworzyć trójkąta o podanych bokach.
 */
public class Task12 {
    public static void main(String[] args) {
        int sideA = enterSide("side a");
        int sideB = enterSide("side b");
        int sideC = enterSide("side c");

        isTriangle(sideA, sideB, sideC);
    }

    public static void isTriangle(int a, int b, int c) {
        if ((a + b > c) && (b + c > a) && (c + a > b)) {
            System.out.println("The triangle is possible.");
        } else
            System.out.println("The triangle is not possible.");
    }


    static int enterSide(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }
}
