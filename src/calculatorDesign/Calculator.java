package calculatorDesign;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        calculator();
    }


    public static void calculator() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1.Dodawanie");
            System.out.println("2.Odejmowanie");
            System.out.println("3.Mnożenie");
            System.out.println("4.Dzielenie");
            System.out.println("-1. wyjście z programu");

            System.out.println("Podaj numer wybranej operacji");
            int numberOperation = scanner.nextInt();
            if (numberOperation == -1) {
                System.out.println("application end");
                break;
            }
            System.out.println("Podaj pierwsza liczbe");
            int firstNumber = scanner.nextInt();
            System.out.println("Podaj druga liczbe");
            int secondNumber = scanner.nextInt();


            switch (numberOperation) {
                case 1:
                    System.out.println("Wynik operacji to: " + addingTwoNumbers(firstNumber, secondNumber));
                    break;
                case 2:
                    System.out.println("Wynik operacji to: " + subtractionTwoNumbers(firstNumber, secondNumber));
                    break;
                case 3:
                    System.out.println("Wynik operacji to: " + multiplicationNumbers(firstNumber, secondNumber));
                    break;
                case 4:
                    System.out.println("Wynik operacji to: " + divisionNumbers(firstNumber, secondNumber));
                    break;

                default:
                    System.out.println("opcja nie dostępna");
            }

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

}

