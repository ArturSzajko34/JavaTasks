package meeting3.Poliformizm.Task;

import java.util.ArrayList;
import java.util.List;

public class PoliManie {
    public static void main(String[] args) {

        Square square = new Square(2,10);

        square.printShapeInfo();
        System.out.println("Obwód: " + square.computeArea());
        System.out.println("Pole: " + square.computePerimeter());

        System.out.println("********TASK1******************");

        Retangle retangle = new Retangle(2, 6,10);
        retangle.printShapeInfo();
        System.out.println("Obwód: " + retangle.computeArea());
        System.out.println("Pole: " + retangle.computePerimeter());

        //Task2

        System.out.println("********TAKS2*********************");
        Quadrangle quadrangle = new Quadrangle(1, 2, 3, 4,10);
        Square square1 = new Square(2,10);
        Retangle retangle1 = new Retangle(2, 6,10);

        List<Quadrangle> lista = new ArrayList<>();
        lista.add(square1);
        lista.add(retangle1);

        for (Quadrangle object: lista) {
            object.printShapeInfo();
            System.out.println(object.computePerimeter());
        }

        //Task3
        System.out.println("**********TASK3****************");
        Trapezoid trapezoid = new Trapezoid(1,2,3,4,10);
        List<Quadrangle> lista2 = new ArrayList<>();
        Rhombus rhombus = new Rhombus(1,10);

        List<Quadrangle> list2= new ArrayList<>();
        list2.add(trapezoid);
        list2.add(rhombus);

        System.out.println(list2);

        for (Quadrangle value: list2) {
            value.printShapeInfo();
            System.out.println(value.computeArea());

        }






    }
}
