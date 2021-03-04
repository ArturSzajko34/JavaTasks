package meeting2.ArraysForEach;

public class Task5 {
    public static void main(String[] args) {
        Integer[] numbers = {10, 20, 30, 40, 50, 77};

        System.out.println(getNumberFromTable(numbers,1));

    }

    public static int getNumberFromTable(Integer[] table, int index) {
        int expectedValue = 0;
        for (int i = 0 ; i < table.length; i ++){
            expectedValue = table[index];

        }
        return expectedValue;
    }
}
