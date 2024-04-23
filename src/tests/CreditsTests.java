package tests;

import classes.Credits;
import org.junit.Assert;
import org.junit.Test;

public class CreditsTests {

    @Test
    public void approveCreditsWhenArgumentIsLowerThen550() {
        String actualResult = Credits.approveCredit(549);
        String expectedResult = "Declined";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void approveCreditsWhenArgumentIsBiggerThen550() {
        String actualResult = Credits.approveCredit(551);
        String expectedResult = "Maybe";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void approveCreditsWhenArgumentIsLowerThen675() {
        String actualResult = Credits.approveCredit(657);
        String expectedResult = "Maybe";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void approveCreditsWhenArgumentIsBiggerThen675() {
        String actualResult = Credits.approveCredit(690);
        String expectedResult = "We look forward to doing business with you!";
        Assert.assertEquals(expectedResult, actualResult);
    }

}
