package org.example;

public class InvalidNumberOfPlayers extends Exception {
    public InvalidNumberOfPlayers(String errorMessage) {
        super(errorMessage);
    }
}
