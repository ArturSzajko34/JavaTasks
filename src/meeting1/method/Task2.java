package meeting1.method;

public class Task2 {

    public static void main(String[] args) {
        double area3 = calculateArea(10);
        double area6 = calculateArea(5);
        System.out.printf(String.valueOf(area3));
        System.out.printf(String.valueOf(area6));
    }

    static double calculateArea(int r) {
        return Math.PI *r *r;
    }
}
