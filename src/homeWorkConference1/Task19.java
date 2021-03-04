package homeWorkConference1;

import java.util.Scanner;

/*
Napisz program, który zamienia imię i nazwisko na inicjały.
Na potrzeby zadania zakładamy, że program przyjmuje dwa wyrazy (imię i nazwisko) oddzielone spacją.
Jako wynik otrzymujemy inicjały zapisane wielkimi literami, oddzielone kropką:
Ryszard Kapuściński > R.K
 */
public class Task19 {
    public static void main(String[] args) {
        conversionNameAndSurnameToInitials(enterNameAndSurname());
    }

    public static String enterNameAndSurname() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name and surname ");
        return scanner.nextLine();
    }

    public static void conversionNameAndSurnameToInitials(String nameAndSurname) {
        String firstLetter = String.valueOf(nameAndSurname.charAt(0));
        int test1 = nameAndSurname.indexOf(' ') + 1;
        String secondLetter = String.valueOf(nameAndSurname.charAt(test1));
        System.out.println(firstLetter.toUpperCase() + "." + secondLetter.toUpperCase());
    }
}
