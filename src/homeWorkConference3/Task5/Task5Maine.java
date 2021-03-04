package homeWorkConference3.Task5;


import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/*
Stwórz Set Integerów i wypełnij go 10 różnymi liczbami.
Zaimplementuj metodę, która usunie z niego wszystkie liczby nieparzyste.
Hint: Będziesz musiał poradzić z wyjątkiem ConcurrentModificationException,
który jest rzucany, gdy programi iteruje po kolekcji i jednocześnie próbuje usunąć jej elementy.
Żeby to obsłużyć możesz iterować po kopii oryginalnego Setu i usuwać elementy z oryginalnego.
 */
public class Task5Maine {
    public static void main(String[] args) {

        Random random = new Random();
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i <= 10 ; i ++){
            numbers.add(random.nextInt(100));
        }

        System.out.println(numbers);
        System.out.println(removeElements(numbers));

    }


    static Set<Integer> removeElements(Set<Integer> originalSet) {
        Set<Integer> copy = new HashSet<>(originalSet);
        originalSet.addAll(copy);

        for (int value:copy) {
            if(value % 2 != 0){
                originalSet.remove(value);
            }
        }
        return originalSet;
    }
}
