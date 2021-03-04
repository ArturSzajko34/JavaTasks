package meeting3.Poliformizm.Task;

public class Trapezoid extends  Quadrangle{
    public Trapezoid(int sideA, int sideB, int sideC, int sideD, int height) {
        super(sideA, sideB, sideC, sideD, height);
    }

    public int computeArea() {
        return getSideA() +getSideB()+ getSideC() +getSideD();
    }
}
