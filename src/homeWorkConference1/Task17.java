package homeWorkConference1;

import java.util.Scanner;

/*
BMI = masa ciała / wzrost²
 */
public class Task17 {
    public static void main(String[] args) {
        calculatorBMI(enterYourWeight(), enterYourHeight());
    }


    public static void calculatorBMI(int weight, double height) {
        double value = weight / Math.pow(height, 2);
        if (value < 18.5) {
            System.out.println("Under Weight" );
        } else if (value >= 18.5 || value < 24.9) {
            System.out.println("Healthy Weight");
        } else if (value >= 25.0 || value < 29.9) {
            System.out.println("Overweight");
        } else if (value >= 30.0 || value < 39.9) {
            System.out.println("Obesity");
        } else if (value >= 40) {
            System.out.println("Sever obesity");
        }
    }

    public static int enterYourWeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kg: ");
        return scanner.nextInt();
    }

    public static double enterYourHeight() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height in meters: ");
        return scanner.nextDouble();
    }
}

