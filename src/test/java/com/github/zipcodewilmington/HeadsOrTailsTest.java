package com.github.zipcodewilmington;
import com.github.zipcodewilmington.casino.games.coinflip.CoinFlip;
import org.junit.Assert;
import org.junit.Test;

public class HeadsOrTailsTest {

    @Test
    public void getPlayerGuess() {
    }

    @Test
    public void flipCoin() {

        CoinFlip coinFlip = new CoinFlip(); // Assuming CoinFlip is the class name
        int result = coinFlip.flipCoin();
        Assert.assertTrue("The flip result must be 1 or 2", result == 1 || result == 2);

    }

    @Test
    public void testCheckMatch() {
        CoinFlip coinFlip = new CoinFlip();
        Assert.assertTrue("checkMatch should return true when guess matches flip result",
                coinFlip.checkMatch(1, 1));
    }

    @Test
    public void testCheckMatch2() {
        CoinFlip coinFlip = new CoinFlip();
        Assert.assertFalse("checkMatch should return false when guess does not match flip result",
                coinFlip.checkMatch(1, 2));
    }

}
