package test;

import org.junit.Assert;
import org.junit.Test;
import src.Dice;

public class ThrowTest {
   @Test
    public void createDice() {
      Dice dice = new Dice(5);
      Assert.assertEquals(1,1);
   }
}
