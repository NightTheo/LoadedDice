package test;

import Random.RNG;
import Random.RNGMock;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import src.Knucklebone;
import src.Throw;

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

    @Test
    public void singleKnuckleboneRoll() {
        Throw throwTest = new Throw(new int[]{}, 0,1);
        throwTest.run();
        Assert.assertEquals("[4]", throwTest.getLastThrow().toString());
    }

    @Test
    public void doubleKnuckleboneRoll() {
        Throw throwTest = new Throw(new int[]{}, 0,2);
        throwTest.run();
        Assert.assertEquals("[4, 4]", throwTest.getLastThrow().toString());
    }
}
