package meeting3.Abstrakcja.Task2;

public class Osa extends Motorbike{

    @Override
    public String toString(){
        return "Osa";
    }


    @Override
    public void fillUp() {
        System.out.println("rider is resting");
    }
}
