/*
    6510405806
    Weeranut Chayakul
*/

package org.example;

public class Player {
    private String name;
    private Die[] dice;
    private Board board;
    private Piece piece;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void initializePiece() {
        piece = new Piece(board.getStartLocation());
    }

    public void setDice(Die[] dice) {
        this.dice = dice;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void takeTurn() {
        int totalFaceValue = 0;
        for (Die die : dice) {
            die.roll();
            int faceValue = die.getFaceValue();
            totalFaceValue += faceValue;
        }

        Square oldLocation = piece.getLocation();
        Square newLocation = board.getSquare(oldLocation, totalFaceValue);
        piece.setLocation(newLocation);

        String text =
                "\tPlayer name: " + name + "\n\tRoll: " + totalFaceValue + "\n\tMove from " +
                oldLocation.getName() + " to " + newLocation.getName() + ".";
        System.out.println(text);
    }
}
