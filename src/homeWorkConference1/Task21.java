package homeWorkConference1;

/*
Napisz metodę, która przyjmuje 5 liczb całkowitych i wzraca sumę liczbę dodatnich.
Przykład:
getSumOfPositives(1,-4,7,12,-20) > 1 + 7 + 12 = 20
 */
public class Task21 {
    public static void main(String[] args) {
        getSumOfPositives(-1, -2, -3, -4, 5);
    }

    public static void getSumOfPositives(int a, int b, int c, int d, int e) {
        int[] numbers = {a, b, c, d, e};
        int result = 0;

        for (int number : numbers) {
            if (number > 0) {
                result = result + number;
            }
        }
        System.out.println(result);
    }
}
