package noughtsAndCrossesGame;

import java.util.Scanner;

public class Players {

    private final String name;
    private final NoughtsAndCrosses symbol;
    private final Board board;


    public Players(NoughtsAndCrosses symbol, Board board) {
        this.symbol = symbol;
        this.board = board;
        this.name = enterPlayers();

    }

    public boolean chooseBoxToCheck() {
        int index = enterMoveFromPlayer();
        boolean isMoveSuccess = board.makeMoveOnTheBoard(index, symbol);
        boolean isWine = board.isWine(symbol);

        if (!isMoveSuccess) {
            System.out.println("Failed, try again " + this.name);
            chooseBoxToCheck();

        }
        if(isWine){
            System.out.println("Win " + this.name);
            return true;
        }
        return false;
    }


    public String getName() {
        return name;
    }

    public String getSymbol() {
        return symbol.getSymbol();
    }

    private String enterPlayers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name players: ");
        return scanner.nextLine();
    }

    private int enterMoveFromPlayer() {
        System.out.println("Move player " + this.name);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
