package Random;

public class RNG {
    private static RNGImpl impl = new RNGImpl();

    private RNG() {}

    public static void setImpl(RNGImpl impl) {
        RNG.impl = impl;
    }

    public static int random(int max) {
        return impl.random(max);
    }

    public static int randomBreakDice(int max) { return impl.randomBreakDice(max); }

    public static int randomBreakCoin(int max) { return impl.randomBreakCoin(max); }

}

