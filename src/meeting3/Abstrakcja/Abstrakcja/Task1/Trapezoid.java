package meeting3.Abstrakcja.Abstrakcja.Task1;

public class Trapezoid extends Quadrangle {

    public Trapezoid(int sideA, int sideB, int sideC, int sideD, int height) {
        super(sideA, sideB, sideC, sideD, height);
    }


    public int computerArea() {
        return (getSideA() + getSideA()) * getHeight() / 2;

    }
}
