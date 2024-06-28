/*
    6510405806
    Weeranut Chayakul
*/

package org.example;

public class MonopolyGame {
    private final int totalRound;
    private int roundCount;
    private final Die[] dice;
    private final Board board;
    private final Player[] players;

    public MonopolyGame(int totalRound, int totalSquares, Player[] players) {
        this.totalRound = totalRound;
        this.players = players;
        roundCount = 0;
        board = new Board(totalSquares);
        dice = new Die[]{ new Die(), new Die() };

        for (Player player : players) {
            player.setBoard(board);
            player.setDice(dice);
            player.initializePiece();
        }
    }

    public void playGame() {
        while (roundCount < totalRound) {
            playRound();
            roundCount++;
        }
    }

    private void playRound() {
        System.out.println("Round " + (roundCount + 1) + ":");
        for (Player player : players) {
            player.takeTurn();
        }
    }
}
