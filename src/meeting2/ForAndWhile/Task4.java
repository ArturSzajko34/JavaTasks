package meeting2.ForAndWhile;

import java.util.Scanner;

/*
Zaimplementuj program pobierający liczbę i drukujący sumę liczb od 0 do tej liczby.
Na przykład: [4] →1+2+3+4 = 10
 */
public class Task4 {
    public static void main(String[] args) {

        int number = getNumber();
        int value = 0;

        for (int i = 0 ; i <= number; i++){
            value += i;
        }
        System.out.println(value);

    }

    public static int getNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        return scanner.nextInt();
    }
}
