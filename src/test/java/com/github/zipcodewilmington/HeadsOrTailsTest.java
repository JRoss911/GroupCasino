package com.github.zipcodewilmington;
import com.github.zipcodewilmington.casino.games.Trivia.TriviaGame;
import org.junit.Assert;
import org.junit.Test;

public class HeadsOrTailsTest {
    @Test
    public void exampleTest(){
        boolean input = TriviaGame.startGame();
        Assert.assertTrue(input);
    }
}
