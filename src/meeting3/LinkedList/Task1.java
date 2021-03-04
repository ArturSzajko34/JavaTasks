package meeting3.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> myList1 = new ArrayList<>();
        List<Integer> myList2 = new LinkedList<>();


        long arrayList = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            myList1.add(0, i);
        }

        long arrayBefore = System.currentTimeMillis();
        long time = arrayBefore - arrayList;
        System.out.println(time);

        long arrayList2 = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            myList2.add(0, i);
        }
        long arrayBefore2 = System.currentTimeMillis();
        long time2 = arrayBefore2 - arrayList2;

        System.out.println("Time 1= " + time);
        System.out.println("Time 2= " + time2);

    }
}
