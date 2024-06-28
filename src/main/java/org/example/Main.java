/*
    6510405806
    Weeranut Chayakul
*/

package org.example;

public class Main {
    public static void main(String[] args) {
        Player[] players = {
                new Player("A"),
                new Player("B")
        };

        MonopolyGame newGame = new MonopolyGame(
                50, 40, players
        );
        newGame.playGame();
    }
}