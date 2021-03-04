package meeting2.ForAndWhile;

/*
Zaimplementuj program drukujący liczby nieparzyste z przedziału 1-100 używają pętli for.
 */
public class Task3 {
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }
}
