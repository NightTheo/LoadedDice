package test;

import Random.RNG;
import Random.RNGMock;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import src.Dice;
import src.Throw;

import java.util.ArrayList;


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

    @Test
    public void singleD6Roll() {
        Throw throwTest = new Throw(new int[]{6}, 0,0);
        Assert.assertEquals("[4]", throwTest.run().toString());
    }

    @Test
    public void twoD6Roll() {
        Throw throwTest = new Throw(new int[]{6,6}, 0,0);
        Assert.assertEquals("[4, 4]", throwTest.run().toString());
    }

    @Test
    public void wrongDice() {
        Throw throwTest = new Throw(new int[]{21}, 0, 2);
        Assert.assertEquals("[-1]", throwTest.run().toString());
    }
}
