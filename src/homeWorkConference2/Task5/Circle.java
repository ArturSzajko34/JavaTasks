package homeWorkConference2.Task5;

/*
Napisz wszystkie możliwe konstruktory dla klasy Circle z poprzedniego zadania.Area nie powinna być przekazywana jako argument konstruktora.
 Pole powierzchni powinno być obliczone i wstawione w zmienną area wtedy,kiedy jest to możliwe
 (wtedy kiedy został wywołany konstruktor, który posiada niezbędne dane do obliczenia pola powierzchni).
 Pamiętaj o bezargumentowym konstruktorze.
 */
public class Circle {
    private double x;
    private double y;
    private double r;
    private double area;

    public Circle() {
    }

    public Circle(double x) {
        this.x = x;
    }

    public Circle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
        this.area = x * y * r;
        System.out.println(area);
    }

}
