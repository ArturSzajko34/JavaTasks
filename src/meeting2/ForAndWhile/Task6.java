package meeting2.ForAndWhile;

import java.util.Scanner;

/*
Zaimplementuj prosty formularz logowania. Poproś użytkownika o odgadnięcie tajnego hasła („qwerty123”).
 Jeśli jest poprawne, wypisz „zalogowany”, w przeciwnym razie wypisz „nieprawidłowe hasło”.
  Uruchom program, dopóki użytkownik wpisze nieprawidłowe hasło.
 */

//Zadanie można było rozwiązać doWhile
public class Task6 {
    public static void main(String[] args) {

        boolean logicValue;

        while (true) {
            if (verificationPassword(getPassword())) {
                logicValue = false;
                break;
            }
        }

    }

    public static String getPassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password");
        return scanner.nextLine();
    }

    public static boolean verificationPassword(String password) {
        String expectedPassword = "qwerty123";

        if (password.equals(expectedPassword)) {
            System.out.println("Password is correct");
            return true;
        } else {
            System.out.println("Bad password");
            return false;
        }
    }
}
