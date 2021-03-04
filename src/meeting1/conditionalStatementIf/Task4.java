package meeting1.conditionalStatementIf;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        checkThatDividedByThree(enteredNumber());
    }

    public static int enteredNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        return scanner.nextInt();
    }

    public static boolean checkThatDividedByThree(int number) {
        if (number % 3 == 0) {
            System.out.println("True");
            return true;
        } else {
            System.out.println("False");
            return false;
        }
    }
}
