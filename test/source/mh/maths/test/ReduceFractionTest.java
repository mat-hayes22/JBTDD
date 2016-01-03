package mh.maths.test;

import mh.maths.Fraction.Fraction;
import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mat on 03/01/2016.
 */
public class ReduceFractionTest {

    @Test
    public void alreadyInLowestTerms() throws Exception {
        assertEquals(new Fraction(2,4), new Fraction(2,4));
    }

    @Test
    @Ignore("Waiting to implement GCD)")
    public void reduceToNotWholeNumber() throws Exception {
        assertEquals(new Fraction(3,4), new Fraction(6,8));
    }


}