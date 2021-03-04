package meeting3.Abstrakcja.Abstrakcja.Task1;

public abstract class Quadrangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;
    private final int height;

    public Quadrangle(int sideA, int sideB, int sideC, int sideD, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.height = height;
    }

    public abstract int computerArea();


    public int computerPerimeter() {
        int circuit = sideA + sideB + sideC + sideD;
        return circuit;
    }


    public void printShapeInfo() {
        System.out.println(this.getClass().getSimpleName());
        System.out.println("bok a: " + sideA);
        System.out.println("bok b: " + sideB);
        System.out.println("bok c: " + sideC);
        System.out.println("bok d: " + sideD);
        System.out.println("wysokość: " + height);
    }


    public int copArea () {
        throw new IllegalStateException("dla tego obiektu metoda nie jest wspierana :" + this.getClass().getSimpleName());
    }


    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public int getSideD() {
        return sideD;
    }

    public int getHeight() {
        return height;
    }
}
