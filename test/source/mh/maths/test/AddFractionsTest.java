package mh.maths.test;

import mh.maths.Fraction.Fraction;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.internal.requests.FilterRequest;

import static org.junit.Assert.assertEquals;

/**
 * Created by mat on 01/01/2016.
 */
public class AddFractionsTest {

    @Test
    public void zeroPlusZero() throws Exception {
        assertEquals(new Fraction(0), new Fraction(0).plus(new Fraction(0)));

    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        assertEquals(new Fraction(3), new Fraction(3).plus(new Fraction(0)));

    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        assertEquals(new Fraction(5), new Fraction(0).plus(new Fraction(5)));

    }

    @Test
    public void nonNegativeNonZeroOperand() throws Exception {
        assertEquals(new Fraction(7), new Fraction(3).plus(new Fraction(4)));
    }

    @Test
    public void negativeInputsAndNegativeOutput() throws Exception {
        assertEquals(new Fraction(-2), new Fraction(-3).plus(new Fraction(1)));

    }

    @Test
    public void nonTrivalSameDenominator() throws Exception {
        assertEquals(new Fraction(3,5), new Fraction(1, 5).plus(new Fraction(2, 5)));
    }

    @Test
    public void differentDenominators() throws Exception {
        assertEquals(new Fraction(5,6), new Fraction(1,2).plus(new Fraction(1,3)));
    }

    @Test
    public void reduceResultToWholeNumber() throws Exception {
        assertEquals(new Fraction(1), new Fraction(1,3).plus(new Fraction(2,3)));
    }

    @Test
    public void oneDenominatorIisMulitpleOfOther() throws Exception {
        assertEquals(new Fraction(11,8), new Fraction(3,4).plus(new Fraction(5,8)));
    }

    @Test
    public void commonFactorInDenominator() throws Exception {
        assertEquals(new Fraction(11,18), new Fraction(1,6).plus(new Fraction(4,9)));
    }

    @Test
    public void reduceResultWhenDenomIsTheSame() throws Exception {
        assertEquals(new Fraction(3,2), new Fraction(3,4).plus(new Fraction(3,4)));
    }

    @Test
    public void negativeFractionAndReducing() throws Exception {
        assertEquals(new Fraction(1,2), new Fraction(-1,4).plus(new Fraction(3,4)));
        assertEquals(new Fraction(-1,8), new Fraction(3,8).plus(new Fraction(-1,2)));
    }

    @Test
    public void negativeEverywhere() throws Exception {
        assertEquals(new Fraction(1,2), new Fraction(1,-4).plus(new Fraction(-3,-4)));
    }


}

