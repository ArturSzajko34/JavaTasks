package meeting2.ArraysForEach;

public class Task2 {
    public static void main(String[] args) {

        Integer[] numbers = {10,20,30,40,50};

        for (int i = 0; i < 5 ; i++){
            int value = numbers[i];
            System.out.println(value);
        }

        System.out.println("*****************");

        for (int i: numbers){
            System.out.println(i);
        }

    }
}

