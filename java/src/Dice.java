package src;

import Random.RNG;

import java.util.ArrayList;

public class Dice extends Throwable {
    public Dice(int value) {
        super(value, initFaces(value), true );
        if( value < 4 || value > 20 ) {
            throw new IllegalArgumentException("The value of the dice must be between 4 and 20");
        }
    }



}