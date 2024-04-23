package tests;

import classes.Number;
import org.junit.Assert;
import org.junit.Test;

public class NumberTests {

    @Test
    public void makeTheNumberCube() {
       long actualResult = Number.makeCube(1234567891);
       long expectedResult = 1234567891;
       Assert.assertEquals(expectedResult, actualResult);
    }
}
