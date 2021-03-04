package homeWorkConference2.Task7;
/*
Zaimplementuj metodę, która przyjmuje tablice integerów jako parametr w metodzie.
Posortuj tę tablice malejąco i zwróć ją.
 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class Maine {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        sortTable(numbers);

    }

    public static void sortTable(int[] arrays) {
        int[] reverseArr = IntStream.rangeClosed(1, arrays.length).map(i -> arrays[arrays.length - i]).toArray();
        System.out.println(Arrays.toString(reverseArr));
    }
}
