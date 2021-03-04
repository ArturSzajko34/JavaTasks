package meeting1.string;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int number = enteredNumber();
        verificationEnteredNumber(number);
    }

    public static int enteredNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number:");
        return scanner.nextInt();
    }

    public static boolean verificationEnteredNumber(int number) {
        if (number >= 13 && number < 19) {
            System.out.println("A number in the range");
            return true;
        } else {
            System.out.println("number out of range: ");
            return false;
        }
    }
}
