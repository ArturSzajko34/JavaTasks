package homeWorkConference1;

/*
Zaimplementuj metodę multiplyString, która przyjmuje dwa parametry: String s i int n, a następnie
zwraca String n-razy.
np
multiplyString ("Course”, 3)  “CourseCourseCourse”
 */
public class Task18 {
    public static void main(String[] args) {
        multiplyString("test", 2);
        multiplyString("Artur", 6);


    }

    public static void multiplyString(String value, int number) {
        for (int i = 0; i < number; i++) {
            System.out.print(value);
        }
        System.out.println();
    }
}
