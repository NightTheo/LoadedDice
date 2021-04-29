package Random;

public class RNGMock extends RNGImpl {

    @Override
    public int random(int max) {
        return max > 0 ? max / 2 : 0;
    }

    @Override
    public int randomBreakDice(int max) {
        return max > 0 ? max / 10 : 0;
    }

    @Override
    public int randomBreakCoin(int max) {
        return max > 0 ? max / 20 : 0;
    }
}
