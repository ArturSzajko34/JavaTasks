package meeting2.LoopsContinue;

/*
Napisz program, który wypisuje liczby w przedziale 20-30, ale pomija 23 i 25. Użyj continue.
 */
public class Task1 {
    public static void main(String[] args) {

        for (int i = 20; i <= 30; i++) {
            if (i == 23 || i == 25) {
                continue;
            }
            System.out.println(i);
        }
    }
}
