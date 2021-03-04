package homeWorkConference1;

/*
Napisz metodę przyjmującą wartość logiczną (boolean) i zwracającą tekst "Yes" dla true i "No" dla
false.
 */
public class Task20 {
    public static void main(String[] args) {
        System.out.println(returnValue(true));
        System.out.println(returnValue(false));
    }

    public static String returnValue(boolean value) {
        if (value) {
            return "Yes";
        } else {
            return "No";
        }
    }
}

