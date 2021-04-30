package Random;

public class RNGMockBreak extends RNGImpl {
    @Override
    public int random(int max) {
        return 0;
    }
}
