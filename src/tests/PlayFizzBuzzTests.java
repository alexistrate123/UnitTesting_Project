package tests;

import classes.Game;
import org.junit.Assert;
import org.junit.Test;

public class PlayFizzBuzzTests {
    @Test
    public void playFizzBuzzWhenArgumentIs15Test() {
        String actualResult = Game.playFizzBuzz(15);
        String expectedResult = "FizzBuzz";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void playFizzBuzzWhenArgumentIs7() {
        String actualResult = Game.playFizzBuzz(7);
        String expectedResult = "7";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void playFizzBuzzWhenArgumentIs3() {
        String actualResult = Game.playFizzBuzz(3);
        String expectedResult = "Fizz";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void playFizzBuzzWhenArgumentIs5() {
        String actualResult = Game.playFizzBuzz(5);
        String expectedResult = "Buzz";
        Assert.assertEquals(expectedResult, actualResult);
    }



}
