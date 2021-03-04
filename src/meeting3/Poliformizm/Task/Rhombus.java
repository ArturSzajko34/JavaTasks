package meeting3.Poliformizm.Task;

public class Rhombus extends Quadrangle {

    public Rhombus(int sideA, int height) {
        super(sideA, sideA, sideA, sideA, height);
    }

    public int computeArea() {
        return getSideA() * 4;
    }
}
