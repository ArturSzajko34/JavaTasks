package meeting3.Abstrakcja.Task2;

public class Tesla extends EletricCar{

    @Override
    public String toString(){
        return "Tesla";
    }

    @Override
    public void fillUp() {
        System.out.println("charging");
    }
}
