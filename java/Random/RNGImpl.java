package Random;

import java.util.Random;

public class RNGImpl {
    private static Random r = new Random();
    public int random(int max) {
        return r.nextInt(max);
    }
    public int randomBreakDice(int max) {
        return randomBreakDice(max);
    }
    public int randomBreakCoin(int max) {
        return randomBreakCoin(max);
    }
}