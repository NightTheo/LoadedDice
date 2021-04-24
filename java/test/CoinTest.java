package test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import src.Coin;


public class CoinTest {

    /*@BeforeClass
    public static void mockRNG() {
        RNG.setImpl(new RNGMock());
    }*/

    @Test
    public void SingleCoinThrow () {
        Coin c = new Coin() ;
        Assert.assertEquals(1, c.throwCoin());
    }


}
