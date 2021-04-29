package src;

import Random.RNG;
import Random.RNGMock;

public class LoadedDice  extends Dice {
    private int loadedFace;
    private double probability;
    public LoadedDice(int value, int loadedFace, int probability) {
        super(value);
        if (loadedFace > value)
            throw new IllegalArgumentException("The loaded face must be a face of the dice: " + loadedFace + " > " + value);
        if (probability < 50 || probability > 100)
            throw new IllegalArgumentException("The additional probability must be between 50 and 100 (inclusive)");

        this.loadedFace = loadedFace;
        this.probability = probability;
    }

    @Override
    public int roll() {
        double random = RNG.random(100);
        if(this.probability >= random)
            return this.loadedFace;
        else
            return super.roll();
    }
}
