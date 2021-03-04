package meeting2.LoopsBrake;

/*
Program posiada metodę login(String userName, String password) która zwraca wartość boolean
(true jeśli podane dane logowania są poprawne i false jeśli nie sąpoprawne).

Wiesz, że nazwa użytkownika to"marcin.kowalski”.Zaimplementuj program do "łamania haseł".
Wiesz, że hasło to jego rok urodzenia (ale nie wiesz, który to rok).
Użyj pętli while i słowa kluczowego break.
Wydrukuj na konsoli poprawne (złamane) hasło.
 */
public class Task1 {
    public static void main(String[] args) {

        while (true){

        }

    }

    public static boolean login(String username, int password) {
        return (username.equals("marcin.kowalski") && password == 1989);
    }
}
