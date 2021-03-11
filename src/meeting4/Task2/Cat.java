package meeting4.Task2;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    public void bitePostman(){
        System.out.println("bitten by " + getName());
    }


}
