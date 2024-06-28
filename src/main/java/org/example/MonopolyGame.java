/*
    6510405806
    Weeranut Chayakul
*/

package org.example;

import java.util.ArrayList;

public class MonopolyGame {
    private final int totalRound;
    private int roundCount;
    private final Die[] dice;
    private final Board board;
    private final ArrayList<Player> players;

    public MonopolyGame(int totalRound, int totalSquares, String[] playerNames) throws InvalidNumberOfPlayers {
        this.totalRound = totalRound;
        players = new ArrayList<>();
        roundCount = 0;
        board = new Board(totalSquares);
        dice = new Die[]{ new Die(), new Die() };

        if (playerNames.length < 2 || playerNames.length > 8) {
            throw new InvalidNumberOfPlayers("Invalid number of players: " + playerNames.length);
        }
        for (String name : playerNames) {
            Player newPlayer = new Player(name);
            newPlayer.setBoard(board);
            newPlayer.setDice(dice);
            newPlayer.initializePiece();
            players.add(newPlayer);
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
