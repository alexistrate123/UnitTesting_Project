package tests;

import classes.Word;
import org.junit.Assert;
import org.junit.Test;

public class WordTests {

    @Test
    public void reverseWordCar() {
        String actualResult = Word.reverseWord();
        String expectedResult = "rac";
        Assert.assertEquals(expectedResult, actualResult);
    }

}
