package com.github.zipcodewilmington;

import com.github.zipcodewilmington.casino.games.tradingday.TradingDayGame;
import org.junit.Assert;
import org.junit.Test;

public class TradingDayTest {
    private String getStonkName;
    private int getPortfolio;
    private int[] getStonk;

/*    +selectStonk(stonkName): String
+stonkValues(stonkValues): int
+valueChange(): int
+stonkSelection(): int
+portfolioValue(): int
+valueChange(): void
    stonks : stonk[]
    portfolio: Portfolio
    stonkSelection
+stonkName(): String
*/

   @Test
   public void tradingDayConstructorTest(){
       //Given
    String expectedStonkName = "";
    int[] stonk = new int[]{Integer.MAX_VALUE};
    int portfolio = Integer.MAX_VALUE;

       TradingDayTest tradingDayTest = new TradingDayTest();
        //When
       int[] actualStonk = tradingDayTest.getStonk;
       String actualStonkName =tradingDayTest.getStonkName;
       int actualPortfolio = tradingDayTest.getPortfolio;

        //Then
       Assert.assertEquals(getStonk, actualStonk);
       Assert.assertEquals(expectedStonkName,actualStonkName);
       Assert.assertEquals(getPortfolio, actualPortfolio);
   }

    @Test
    public void testSetStonkName(){
        TradingDayTest tradingDayTest = new TradingDayTest();

        tradingDayTest.testSetStonkName();
        String actual = tradingDayTest.getStonkName;

        Assert.assertEquals("", actual);
    }

    @Test
    public void testSetPortfolio(){
        TradingDayTest tradingDayTest = new TradingDayTest();
        int expected = 1000;

        tradingDayTest.testSetStonkName();

        Assert.assertEquals(expected, getPortfolio);
    }

    @Test
    public void portfolioValueTest(){
    TradingDayTest tradingDayTest = new TradingDayTest();


    }

    @Test
    public void valueChangeTest(){




    }
}
