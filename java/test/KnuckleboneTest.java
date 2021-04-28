package test;

import Random.RNG;
import Random.RNGMock;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import src.Coin;
import src.Knucklebone;

public class KnuckleboneTest {

    @BeforeClass
    public static void mockRNG () {
        RNG.setImpl(new RNGMock());
    }

    @Test
    public void SingleKnuckleboneThrow () {
        Knucklebone k = new Knucklebone();
        Assert.assertEquals(4, k.roll());
    }
}
