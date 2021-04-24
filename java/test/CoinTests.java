package java.test;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.src.Coin;


public class CoinTests {

    /*@BeforeClass
    public static void mockRNG() {
        RNG.setImpl(new RNGMock());
    }*/

    @Test
    public static void SingleCoinThrow () {
        Coin c = new Coin() ;
        Assert.assertEquals(1, c.throwCoin());
    }


}
