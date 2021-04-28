package test;

import org.junit.Assert;
import org.junit.Test;
import src.Coin;
import src.Knucklebone;
import src.Dice;
import src.Throw;

public class ThrowTest {
    @Test
    public void getLastThrowNoRun() {
        Throw throwTest = new Throw(new int[]{6}, 0, 0);
        Assert.assertEquals("[-1]", throwTest.getLastThrow().toString());
    }
}
