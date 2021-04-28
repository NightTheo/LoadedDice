package test;

import Random.RNG;
import Random.RNGMock;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import src.Dice;


public class DiceTest {
    @BeforeClass
    public static void mockRNG() {
        RNG.setImpl(new RNGMock());
    }

    @Test
    public void SingleDiceTest(){
        Dice d = new Dice(6);
        Assert.assertEquals(4, d.roll());
    }
}
