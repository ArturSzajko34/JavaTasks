package meeting2.ArraysForEach;

public class Task3 {
    public static void main(String[] args) {

        Integer[] numbers = {10, 20, 30, 40, 50};
        int value = 0;

        for (int i = 0; i < numbers.length; i++) {
            value = value + numbers[i];
        }
        int average = value / numbers.length;

        System.out.println(average);
    }
}
