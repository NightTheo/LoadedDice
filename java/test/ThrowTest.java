package test;

import Random.RNG;
import Random.RNGMock;
import Random.RNGMockBreak;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import src.Coin;
import src.Knucklebone;
import src.Dice;
import src.Throw;

public class ThrowTest {

    @Before
    public void mockRNG() {
        RNG.setImpl(new RNGMock());
    }

    @Test
    public void getLastThrowNoRun() {
        Throw throwTest = new Throw(new int[]{6}, 0, 0, new int[][]{});
        Assert.assertEquals("[-1]", throwTest.getLastThrow().toString());
    }

    @Test
    public void moreThan5Throwables() {
        try{
            Throw throwTest = new Throw(new int[]{}, 5, 0, new int[][]{});
        }
        catch(Exception e) {
            Assert.assertNotNull(e);
        }
    }

    @Test
    public void NothingToThrow() {
        Throw throwTest = new Throw(new int[]{}, 0, 0, new int[][]{});
        Assert.assertEquals("[]", throwTest.run().toString());
    }

    @Test
    public void D6AndCoin() {
        Throw throwTest = new Throw(new int[]{6}, 1, 0, new int[][]{});
        Assert.assertEquals("[4, 2]", throwTest.run().toString());
    }

    @Test
    public void twoD6AndCoins() {
        Throw throwTest = new Throw(new int[]{6, 6}, 2, 0, new int[][]{});
        Assert.assertEquals("[4, 4, 2, 2]", throwTest.run().toString());
    }

    @Test
    public void D8andKnucklebones() {
        Throw throwTest = new Throw(new int[]{8}, 0, 2, new int[][]{});
        Assert.assertEquals("[5, 4, 4]", throwTest.run().toString());
    }

    @Test
    public void D6Break() {
        RNG.setImpl(new RNGMockBreak());
        Throw throwTest = new Throw(new int[]{6}, 0, 0, new int[][]{});
        Assert.assertEquals("[-1]", throwTest.run().toString());
    }

}
