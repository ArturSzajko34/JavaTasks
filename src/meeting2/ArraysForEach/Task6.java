package meeting2.ArraysForEach;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 77};

        copyTable(numbers);

    }

    public static void copyTable(int[] table){
        int [] copyTable = new int[table.length];
        copyTable = table.clone();
        System.out.println(Arrays.toString(table));
        System.out.println(Arrays.toString(copyTable));
    }
}
