package mh.maths.test;

import mh.maths.Fraction.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Created by mat on 02/01/2016.
 */
public class FractionEqualsTest {

    @Test
    public void sameNumeratorAndDenominator() throws Exception {
        assertEquals(new Fraction(3,5), new Fraction(3,5));
    }

    @Test
    public void differentNumerators() throws Exception {
        assertNotEquals(new Fraction(1,5), new Fraction(2,5));
    }

    @Test
    public void differentDenominators() throws Exception {
        assertNotEquals(new Fraction(3,4), new Fraction(3,7));
    }

    @Test
    public void wholeNumberEqualsSameFraction() throws Exception {
        assertEquals(new Fraction(5,1), new Fraction(5));
    }

    @Test
    public void wholeNumbersdNotEqualToDifferentWholeNumber() throws Exception {
        assertNotEquals(new Fraction(6), new Fraction(5));
    }

/*
    @Test
    public void reduce() throws Exception {
        assertNotEquals(new Fraction(3,4), new Fraction(6,8));
    }
*/


}
