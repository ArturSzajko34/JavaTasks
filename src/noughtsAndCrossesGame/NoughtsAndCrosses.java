package noughtsAndCrossesGame;

public enum NoughtsAndCrosses {

    CIRCLET("o"),
    CROSS("X");

    public String name;

    NoughtsAndCrosses(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return name;
    }
}
