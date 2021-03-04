package homeWorkConference3.Task2;

public class Cat {

    private final String name;
    private final String colour;
    private final boolean hasOwner;
    private final boolean isHungry;


    public Cat(String name, String colour, boolean hasOwner, boolean isHungry) {
        this.name = name;
        this.colour = colour;
        this.hasOwner = hasOwner;
        this.isHungry = isHungry;
    }


    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public boolean isHungry() {
        return isHungry;
    }
}
