package meeting3.Poliformizm.Task;
//Prostokąt
public class Retangle extends Quadrangle{


    public Retangle(int sideA, int sideB, int height) {
        super(sideA, sideB, sideA, sideB, height);
    }

    public int computeArea() {
        return getSideA() * getSideB();
    }
}
