package noughtsAndCrossesGame;

public class StartGame {
    public static void main(String[] args) {

// tutaj przenieść pobieranie danych od usera

        // wynieść z playera chooseBoxToCheck do borda

        System.out.println("Welcome to the game");

        Board board = new Board();

        Players players1 = new Players(NoughtsAndCrosses.CIRCLET, board);
        Players players2 = new Players(NoughtsAndCrosses.CROSS, board);
        System.out.println("Player1: " + players1.getName() + " lest play the symbol: " + players1.getSymbol());
        System.out.println("Player2: " + players2.getName() + " lest play the symbol: " + players2.getSymbol());

        Game game = new Game(players1, players2, board);
        game.start();
    }
}
