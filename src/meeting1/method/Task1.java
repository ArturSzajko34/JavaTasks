package meeting1.method;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        getAvgNumber(enteredNumberOne(),enteredNumberTwo(),enteredNumberTree());

    }

    public static int enteredNumberOne(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number:");
        return scanner.nextInt();

    }

    public static int enteredNumberTwo(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your second number:");
        return scanner.nextInt();
    }

    public static int enteredNumberTree(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your third number:");
        return scanner.nextInt();
    }

    public static void getAvgNumber(int numberOne, int numberTwo, int numberTree){
        int medium = (numberOne + numberTwo + numberTree) / 3;
        System.out.println("average it: " + medium);
    }
}
