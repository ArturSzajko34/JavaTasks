package meeting3.Abstrakcja.Task2;

public class Komar extends Motorbike{

    @Override
    public String toString(){
        return "Komar";
    }

    @Override
    public void fillUp() {
        System.out.println("fueling");
    }
}
