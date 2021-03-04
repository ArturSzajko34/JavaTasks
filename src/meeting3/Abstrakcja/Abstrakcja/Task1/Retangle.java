package meeting3.Abstrakcja.Abstrakcja.Task1;

public class Retangle extends Quadrangle {



    public Retangle(int sideA, int sideB) {
        super(sideA, sideB, sideA, sideB, sideB);
    }

    public int computerArea (){
        return getSideA() * getSideB();
    }
}
