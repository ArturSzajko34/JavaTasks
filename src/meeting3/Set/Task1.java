package meeting3.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {
    public static void main(String[] args) {

        String name1= "Daro";
        String name2= "Jaro";
        String name3="Mati";
        String name4="Seba";
        String name5="Gruby";


        Set<String> namesSet = new HashSet<>();
        namesSet.add(name1);
        namesSet.add(name2);
        namesSet.add(name3);
        namesSet.add(name4);
        namesSet.add(name5);
        System.out.println(namesSet);


        Set<String> namesLinked = new LinkedHashSet<>();
        namesLinked.add(name1);
        namesLinked.add(name2);
        namesLinked.add(name3);
        namesLinked.add(name4);
        namesLinked.add(name5);
        System.out.println(namesLinked);
        //Wyswietla w takiej kolejnosci jak było dodane


        Set<String> namesTree = new TreeSet<>();
        namesTree.add(name1);
        namesTree.add(name2);
        namesTree.add(name3);
        namesTree.add(name4);
        namesTree.add(name5);
        System.out.println(namesTree);

    }
}
