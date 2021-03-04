package meeting3.Abstrakcja.Abstrakcja.Task1;

public class Square extends Quadrangle {


    public Square(int sideA) {
        super(sideA, sideA, sideA, sideA, sideA);
    }

    public int computerArea(){
        return getSideA() * getSideA();

    }

}
