package mh.maths.test;

import mh.maths.Fraction.Fraction;
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
}

