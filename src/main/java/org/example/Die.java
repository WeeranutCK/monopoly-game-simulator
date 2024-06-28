/*
    6510405806
    Weeranut Chayakul
*/

package org.example;

import java.util.Random;

public class Die {
    private int faceValue;

    public Die() {
        faceValue = 0;
    }

    public int getFaceValue() {
        return faceValue;
    }

    public void roll() {
        Random randomizer = new Random();
        faceValue = randomizer.nextInt(1,7);
    }
}
