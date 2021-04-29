package Random;

public class RNGMock extends RNGImpl {

    @Override
    public int random(int max) {
        return max > 0 ? max / 2 : 0;
    }

    @Override
    public int randomBreak(int max) {
        return max > 0 ? max / 10 : 0;
    }
}
