package noughtsAndCrossesGame;

import java.util.ArrayList;
import java.util.List;

public class Board {

    public String[] board;

    public Board() {
        this.board = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8"};
    }


    public void displayBoard() {
        System.out.println("-----------");
        System.out.println(board[0] + " | " + board[1] + " | " + board[2] + " | ");
        System.out.println("-----------");
        System.out.println(board[3] + " | " + board[4] + " | " + board[5] + " | ");
        System.out.println("-----------");
        System.out.println(board[6] + " | " + board[7] + " | " + board[8] + " | ");
        System.out.println("-----------");
    }

    public boolean makeMoveOnTheBoard(int index, NoughtsAndCrosses symbol) {
        if (applyMove(index)) {
            board[index] = symbol.getSymbol();
            return true;
        }
        return false;
    }


    private boolean applyMove(int index) {
        if (index >= board.length) {
            return false;
        }
        if (board[index].equals(NoughtsAndCrosses.CIRCLET.getSymbol())) {
            return false;
        }
        if (board[index].equals(NoughtsAndCrosses.CROSS.getSymbol())) {
            return false;
        }
        return true;
    }

    public boolean isWine(NoughtsAndCrosses symbol) {
        return checkHorizontally(symbol) || checkVertical(symbol) || checkOnTheCross(symbol);
    }


    private boolean checkHorizontally(NoughtsAndCrosses symbol) {

        for (int i = 0; i < 3; i++) {
            if (board[i * 3].equals(symbol.getSymbol()) && board[i * 3 + 1].equals(symbol.getSymbol()) && board[i * 3 + 2].equals(symbol.getSymbol())) {
                return true;
            }
        }
        return false;
    }

    private boolean checkVertical(NoughtsAndCrosses symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i].equals(symbol.getSymbol()) && board[i + 3].equals(symbol.getSymbol()) && board[i + 6].equals(symbol.getSymbol())) {
                return true;
            }
        }
        return false;
    }


    private boolean checkOnTheCross(NoughtsAndCrosses symbol) {
        return (board[0].equals(symbol.getSymbol()) && board[4].equals(symbol.getSymbol()) && board[8].equals(symbol.getSymbol())) ||
                (board[2].equals(symbol.getSymbol()) && board[4].equals(symbol.getSymbol()) && board[6].equals(symbol.getSymbol()));
    }


    public List<String> checkEmptyFieldsForSingleGame() {

        List<String> emptyList = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            if (board[i].equals(NoughtsAndCrosses.CIRCLET.getSymbol()) || (board[i].equals(NoughtsAndCrosses.CROSS.getSymbol()))) {
            } else {
                emptyList.add(board[i]);
            }
        }
        return emptyList;
    }


}

