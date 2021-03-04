package noughtsAndCrossesGame;

public class Game {

    private final Players firstPlayer;
    private final Players secondPlayer;
    private final Board board;

    public Game(Players firstPlayer, Players secondPlayer, Board board) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.board = board;
    }

    public void start() {
        while (true) {
            board.displayBoard();
            boolean winFirstPlayer = firstPlayer.chooseBoxToCheck();
            if (winFirstPlayer) {
                board.displayBoard();
                break;
            }
            board.displayBoard();
            boolean winSecondPlayer = secondPlayer.chooseBoxToCheck();
            if (winSecondPlayer) {
                board.displayBoard();
                break;
            }
        }
    }
}
