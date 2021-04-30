package src;

import Random.RNG;
import Random.RNGMock;

import java.util.ArrayList;
import java.util.Arrays;

public class Coin extends Throwable{
    public Coin() {
        super(2, (ArrayList<Integer>) Arrays.asList(0,1), true);
    }
}