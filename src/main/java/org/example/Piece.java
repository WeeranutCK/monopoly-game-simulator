/*
    6510405806
    Weeranut Chayakul
*/

package org.example;

public class Piece {
    private Square location;

    public Piece(Square location) {
        this.location = location;
    }

    public Square getLocation() {
        return location;
    }

    public void setLocation(Square location) {
        this.location = location;
    }
}
