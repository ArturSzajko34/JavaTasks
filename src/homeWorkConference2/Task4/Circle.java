package homeWorkConference2.Task4;

/*
Utwórz klasę Circle, stwórz w niej konstruktor, który przyjmuje wszystkie parametry poza area.
Oblicz pole powierzchni i zainicjalizuj pola klasy Circle na podstawie przekazanych w konstruktorze parametrów.
 */
public class Circle {
    private double x;
    private double y;
    private double r;
    private double area;

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;

    }

    public double surfaceAreaCircle() {
        this.area = x * y * r;
        return area;
    }
}
