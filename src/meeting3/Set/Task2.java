package meeting3.Set;
//Do domu


import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {

        HashSet<String> warzywa = new HashSet<>();
        warzywa.add("pomarancza");warzywa.add("pomelo");warzywa.add("grucha");

        HashSet<String> warzywa1 = new HashSet<>();
        warzywa.add("banan");warzywa.add("pomelo");warzywa.add("grucha");

        warzywa.removeAll(warzywa1);
        System.out.println(warzywa);


        System.out.println(warzywa.retainAll(warzywa1));
    }
}
