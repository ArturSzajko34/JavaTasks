package homeWorkConference2.Task4;

/*
Utwórz klasę Circle, stwórz w niej konstruktor, który przyjmuje wszystkie parametry poza area.
Oblicz pole powierzchni i zainicjalizuj pola klasy Circle na podstawie przekazanych w konstruktorze parametrów.
 */
public class Maine {
    public static void main(String[] args) {
        Circle circle = new Circle(2, 2, 2);
        System.out.println(circle.surfaceAreaCircle());

        Circle circle1 = new Circle(10, 5, 0.2);
        System.out.println(circle1.surfaceAreaCircle());
    }
}
