package homeWorkConference1;

public class Task5WithAsterisk {
/*
Uzupełnij kod we wskazanych miejscach.
Metoda min, przyjmująca 4 parametry powinna obliczać najmniejszą z 4 podanych liczb.Metoda min(a, b, c, d)
powinna korzystać z metody min(a, b).
 */

    public static void main(String[] args) throws Exception {
        System.out.println(min(-10, -5));
        System.out.println(min(-10, -5, -50, -90));
        System.out.println(min(-20, -10, -30, 90));
        System.out.println(min(-80, -1, -75, 40));
    }

    public static int min(int a, int b, int c, int d) {
        return a;
    }


    public static int min(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
