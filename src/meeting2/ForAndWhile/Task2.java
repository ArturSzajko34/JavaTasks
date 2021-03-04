package meeting2.ForAndWhile;

import java.util.Random;

/*
Zaimplementuj program drukujący 10 losowych liczb z przedziału(1-6) używając pętli for.
 */
public class Task2 {
    public static void main(String[] args) {

       for (int i = 0; i <=10; i++){
           generateRandomNumbers();
       }

    }

    public static void generateRandomNumbers(){
        Random random = new Random();
        int number = random.nextInt(6)+1;
        System.out.println(number);
    }
}
