/*
    6510405806
    Weeranut Chayakul
*/

package org.example;

import java.util.ArrayList;

public class MonopolyGame {
    private final int totalRound;
    private final int maximumPlayer;
    private int roundCount;
    private final Die[] dice;
    private final Board board;
    private final ArrayList<Player> players;

    public MonopolyGame(int totalRound, int totalSquares, int maximumPlayer) {
        this.totalRound = totalRound;
        this.maximumPlayer = maximumPlayer;
        players = new ArrayList<>();
        roundCount = 0;
        board = new Board(totalSquares);
        dice = new Die[]{ new Die(), new Die() };
    }

    public void addPlayer(String playerName) throws InvalidNumberOfPlayers {
        if (players.size() == maximumPlayer) {
            throw new InvalidNumberOfPlayers("Maximum player exceeded");
        }
        Player newPlayer = new Player(playerName);
        newPlayer.setBoard(board);
        newPlayer.setDice(dice);
        newPlayer.initializePiece();
        players.add(newPlayer);
    }

    public void addPlayerByArray(String[] playerNames) throws InvalidNumberOfPlayers {
        if (players.size() == maximumPlayer) {
            throw new InvalidNumberOfPlayers("Maximum player exceeded");
        }
        for (String name : playerNames) {
            Player newPlayer = new Player(name);
            newPlayer.setBoard(board);
            newPlayer.setDice(dice);
            newPlayer.initializePiece();
            players.add(newPlayer);
        }
    }

    public void playGame() throws InvalidNumberOfPlayers {
        if (players.size() < 2) {
            throw new InvalidNumberOfPlayers("Need at least 2 players");
        }
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
