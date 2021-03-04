package meeting3.Abstrakcja.Task2;

public class Volkswagen extends PetrolCar{

    @Override
    public String toString(){
        return "Volkswagen";
    }

    @Override
    public void fillUp() {
        System.out.println("fueling");
    }

}
