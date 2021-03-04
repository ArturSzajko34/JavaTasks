package meeting3.Poliformizm.Task;

public class Square extends Quadrangle {

    //Kwadrat

    public Square(int sideA,int height) {
        super(sideA, sideA, sideA, sideA, height);
    }

    //pole powierzchni
    public int computeArea() {
        return getSideA() * getSideA();
    }
}
