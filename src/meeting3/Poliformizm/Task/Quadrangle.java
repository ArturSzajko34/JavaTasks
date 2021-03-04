package meeting3.Poliformizm.Task;
//czworobok
public class Quadrangle {

    private int sideA;
    private int sideB;
    private int sideC;
    private int sideD;
    private int height;

    public Quadrangle(int sideA, int sideB, int sideC, int sideD, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
        this.height = height;
    }

    //obwód
    public int computePerimeter() {
        return this.sideA + this.sideB + this.sideC + this.sideD+ this.height;
    }


    public int computeArea () {
        throw new IllegalStateException("dla tego obiektu metoda nie jest wspierana :" + this.getClass().getSimpleName());
    }

    //informacja o bokach
    public void printShapeInfo() {
        System.out.println("Side A: " + this.sideA);
        System.out.println("Side B: " + this.sideB);
        System.out.println("Side C: " + this.sideC);
        System.out.println("Side D: " + this.sideD);
        System.out.println("Height is:" + this.height);
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
}
