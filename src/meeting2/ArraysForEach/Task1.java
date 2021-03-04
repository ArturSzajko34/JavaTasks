package meeting2.ArraysForEach;

/*
a) Napisz tablicę przechowującą 5 liczb typu integer.Każdąz nich przypisz osobno(jednapo drugiej).
Wydrukuj zawartość tablicy używając pętlifor.
b) Wydrukuj zawartość tablicy używając pętli for-each
 */

public class Task1 {
    public static void main(String[] args) {

        Integer [] tablica = new Integer[5];
        tablica[0] = 10;
        tablica[1] = 1;
        tablica[2] = 20;
        tablica[3] = 3;
        tablica[4] = 4;

        for (int i = 0; i < 5 ; i++){
            int value = tablica[i];
            System.out.println(value);
        }

        System.out.println("*****************");

        for (int i: tablica){
            System.out.println(i);
        }

    }
}
