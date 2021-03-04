package meeting2.ArraysForEach;

public class Task4 {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50, 77};

        checkTheTable(numbers);

    }

    public static boolean checkTheTable(Integer[] table) {

        for (int value : table) {
            if (value == 77) {
                System.out.println("Zawiera");
                return true;
            }
        }
        return false;
    }
}

