package meeting3.Abstrakcja.Abstrakcja.Task1;

import java.util.ArrayList;
import java.util.List;

public class taskMaine {
    public static void main(String[] args) {

        Square square = new Square(1);
        Retangle retangle = new Retangle(1, 2);
        Rhombus rhombus = new Rhombus(1,10);
        Trapezoid trapezoid = new Trapezoid(1,2,3,4,10);

// przyjmuje obiekty typu Quadrangle dla tego przyjuje wszytkie obiekty retangel itp bo one dziedzicza po qadreange
        List<Quadrangle> listRetangle = new ArrayList<>();
        listRetangle.add(retangle);
        listRetangle.add(square);
        listRetangle.add(rhombus);
        listRetangle.add(trapezoid);

//tutaj przeiteruje sie przez wszytkie elementy  dodane wyzej do listy, wywołuje metode copyArea na każdym elemencie
        for (Quadrangle value :listRetangle) {
            value.printShapeInfo();
            System.out.println("obw :" + value.copArea());
            System.out.println("pole pow:" + value.computerPerimeter());
        }
    }
}
