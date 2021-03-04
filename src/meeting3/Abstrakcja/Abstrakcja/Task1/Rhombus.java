package meeting3.Abstrakcja.Abstrakcja.Task1;

public class Rhombus extends Quadrangle {

    public Rhombus(int sideA,int height) {
        super(sideA, sideA, sideA, sideA, height);
    }

    public int computerArea(){
        return getSideA() * getHeight();
    }

}
