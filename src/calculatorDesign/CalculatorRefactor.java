package calculatorDesign;

import java.util.Scanner;

public class CalculatorRefactor {
    public static void main(String[] args) {
        calculator();

    }

    public static void calculator() {
        while (true) {
            displayMenu();
            int value = getUser("Proszę podać numer wybranej operacji");
            if (value == -1) {
                System.out.println("application end");
                break;
            }
            int firstNumber = getUser("Podaj liczbę");
            int secondNumber = getUser("Podaj liczbę");
            swich(value, firstNumber, secondNumber);
        }
    }

    public static int addingTwoNumbers(int a, int b) {
        return a + b;
    }

    public static int subtractionTwoNumbers(int a, int b) {
        return a - b;
    }

    public static int divisionNumbers(int a, int b) {
        return a / b;
    }

    public static int multiplicationNumbers(int a, int b) {
        return a * b;
    }


    public static void displayMenu() {
        System.out.println("1.Dodawanie");
        System.out.println("2.Odejmowanie");
        System.out.println("3.Mnożenie");
        System.out.println("4.Dzielenie");
        System.out.println("-1. wyjście z programu");
    }

    public static int getUser(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextInt();
    }


    public static void swich(int numberOperation, int a, int b) {
        switch (numberOperation) {
            case 1:
                System.out.println("Wynik operacji to: " + addingTwoNumbers(a, b));
                break;
            case 2:
                System.out.println("Wynik operacji to: " + subtractionTwoNumbers(a, b));
                break;
            case 3:
                System.out.println("Wynik operacji to: " + divisionNumbers(a, b));
                break;
            case 4:
                System.out.println("Wynik operacji to: " + multiplicationNumbers(a, b));
                break;

            default:
                System.out.println("opcja nie dostępna");
        }

    }
}

