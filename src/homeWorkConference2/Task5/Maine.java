package homeWorkConference2.Task5;
/*
Napisz wszystkie możliwe konstruktory dla klasy Circle z poprzedniego zadania.
Area nie powinna być przekazywana jako argument konstruktora.
Pole powierzchni powinno być obliczone i wstawione w zmienną area wtedy,
kiedy jest to możliwe (wtedy kiedy został wywołany konstruktor, który posiada niezbędne dane do obliczenia pola powierzchni).
Pamiętaj o bezargumentowym konstruktorze.
 */
public class Maine {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(2,2);
        Circle circle4 = new Circle(2,4,5);
    }

    // Dla czego nie moge stworzyć konstruktora z jednym argumentem y, zrobiłem konstruktor z x
}
