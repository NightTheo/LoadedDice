package src;

import Random.RNG;
import Random.RNGMock;

import java.util.ArrayList;
import java.util.Arrays;

public class Coin extends Throwable{
    public Coin() {
        super(2, Arrays.asList(1,2), true);
    }
}