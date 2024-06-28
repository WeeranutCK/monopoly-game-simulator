/*
    6510405806
    Weeranut Chayakul
*/

package org.example;

public class Main {
    public static void main(String[] args) throws InvalidNumberOfPlayers {
        String[] playerNames = { "A", "B" };
        MonopolyGame newGame = new MonopolyGame(
                50, 40, 8
        );
        newGame.addPlayerByArray(playerNames);
        newGame.playGame();
    }
}