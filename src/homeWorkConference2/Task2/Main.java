package homeWorkConference2.Task2;
/*
Oblicz całkowity koszt piwa
 */
public class Main {
    public static void main(String[] args) {

        Beer beer1 = new Beer();
        Beer.addPrice(5);
        Beer beer2 = new Beer();
        Beer.addPrice(12);
        System.out.println("The cost of beer is " + Beer.beerPrice);
    }
}
