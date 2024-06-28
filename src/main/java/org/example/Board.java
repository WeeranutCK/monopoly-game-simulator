/*
    6510405806
    Weeranut Chayakul
*/

package org.example;
import java.util.Arrays;

public class Board {
    private final Square[] squares;

    public Board(int totalSquares) {
        squares = new Square[totalSquares];
        for (int i = 0; i < totalSquares; i++) {
            squares[i] = new Square(
                    String.valueOf(i)
            );
        }
    }

    public Square getSquare(Square oldLocation, int faceValueTotal) {
        int index = Arrays.asList(squares).indexOf(oldLocation) + faceValueTotal;
        return squares[index % squares.length];
    }

    public Square[] getSquares() {
        return squares;
    }

    public Square getStartLocation() {
        return squares[0];
    }
}
