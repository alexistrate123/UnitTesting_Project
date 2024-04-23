package tests;

import classes.Mathematics;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

public class MathematicsTests {
    Mathematics m;

    @Before
    public void setup() {
        m = new Mathematics();
        System.out.println("Object initialised!");
    }
    @Test
    public void addTwoNumbersTest() {
        // AAA
        //  First A = arrange (The part where we prepare to call the method)
        // Mathematics mathematics = new Mathematics();

        // Second A = Act (The part where we actually call the method)
        int actualResult = m.addTwoNumbers(2,3);

        // Third A = Assert (Is the part what include the (assertion), and the (actual) result is the one (expected = rezultatul care credem noi ca va fi.) )
        int expectedResult = 5;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void calculateAverageTest() {

        int actualResult = m.calculateAverage(2, 3, 1);
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findMaxNumberWhenFirstArgumentIsGreaterTest() {

        int actualResult = m.findMaxNumber(3, 2);
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findMaxNumberWhenSecondArgumentIsGreaterTest() {

        int actualResult = m.findMaxNumber(2, 3);
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, actualResult);
    }


}
