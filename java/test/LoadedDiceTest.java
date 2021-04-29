package test;

import Random.RNG;
import Random.RNGMock;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import src.Dice;
import src.LoadedDice;
import src.Throw;

public class LoadedDiceTest {
    @BeforeClass
    public static void mockRNG() {
        RNG.setImpl(new RNGMock());
    }

    @Test
    public void SingleLoadedDice70pTest(){
        Dice ld = new LoadedDice(6, 2, 70);
        Assert.assertEquals(2, ld.roll());
    }

    @Test
    public void singleLD6Roll() {
        Throw throwTest = new Throw(new int[]{}, 0,0, new int[][]{
                {6,2,70}
        });
        Assert.assertEquals("[2]", throwTest.run().toString());
    }

    @Test
    public void twoLDL6Roll() {
        Throw throwTest = new Throw(new int[]{}, 0,0, new int[][]{
                {6,2,70},
                {6,3,70}
        });
        Assert.assertEquals("[3, 2]", throwTest.run().toString());
    }

}
