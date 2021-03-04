package meeting1.conditionalStatementIf;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        checkEnteredNumber(enteredNumber());
    }

    public static int enteredNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        return scanner.nextInt();
    }

    public static boolean checkEnteredNumber(int number) {
        int expectedValue = 2;
        if (number == expectedValue) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}
