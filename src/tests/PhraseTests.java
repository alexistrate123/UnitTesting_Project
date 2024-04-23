package tests;

import classes.Phrase;
import org.junit.Assert;
import org.junit.Test;

public class PhraseTests {
    @Test
    public void toUpperCaseWordTest() {
        String actualResult = Phrase.toUpperCaseWord("astazi este frumos afara.");
        String expectedResult = "Astazi Este Frumos Afara.";
        Assert.assertEquals(expectedResult, actualResult);
    }
}
