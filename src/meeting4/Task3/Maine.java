package meeting4.Task3;

import java.util.ArrayList;
import java.util.List;

public class Maine {
    public static void main(String[] args) {
        List<Object> listObject = new ArrayList<>();
        listObject.add("String");
        listObject.add(12);
        listObject.add(12.12);
        System.out.println(listObject);

        List<Integer> listInt = new ArrayList<>();
        listInt.add(12);
//        listInt.add("String");
        System.out.println(listInt);

        List<String> listString = new ArrayList<>();
//        listString.add(12);
        listString.add("String");
        System.out.println(listString);



    }
}
