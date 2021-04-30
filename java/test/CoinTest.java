package test;

import Random.RNG;
import Random.RNGMock;
import Random.RNGMockBreak;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import src.Coin;
import src.Throw;


public class CoinTest {

    @BeforeClass
    public static void mockRNG() {
        RNG.setImpl(new RNGMock());
    }

    @Test
    public void SingleCoinThrow () {
        Coin c = new Coin() ;
        Assert.assertEquals(2, c.roll());
    }

    @Test
    public void singleCoinRoll() {
        Throw throwTest = new Throw(new int[]{}, 1,0, new int[][]{});
        throwTest.run();
        Assert.assertEquals("[2]", throwTest.getLastThrow().toString());
    }

    @Test
    public void doubleCoinRoll() {
        Throw throwTest = new Throw(new int[]{}, 2,0, new int[][]{});
        throwTest.run();
        Assert.assertEquals("[2, 2]", throwTest.getLastThrow().toString());
    }

    @Test
    public void CoinBreak() {
        RNG.setImpl(new RNGMockBreak());
        Throw throwTest = new Throw(new int[]{}, 2,0, new int[][]{});
        throwTest.run();
        Assert.assertEquals("[-1, -1]", throwTest.getLastThrow().toString());
    }

}
