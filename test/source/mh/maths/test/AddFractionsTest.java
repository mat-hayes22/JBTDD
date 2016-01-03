package mh.maths.test;

import mh.maths.Fraction.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mat on 01/01/2016.
 */
public class AddFractionsTest {

    @Test
    public void zeroPlusZero() throws Exception {
        assertEquals(0, new Fraction(0).plus(new Fraction(0)).intValue());

    }

    @Test
    public void nonZeroPlusZero() throws Exception {
        assertEquals(3, new Fraction(3).plus(new Fraction(0)).intValue());

    }

    @Test
    public void zeroPlusNonZero() throws Exception {
        assertEquals(5, new Fraction(0).plus(new Fraction(5)).intValue());

    }

    @Test
    public void nonNegativeNonZeroOperand() throws Exception {
        assertEquals(7, new Fraction(3).plus(new Fraction(4)).intValue());

    }

    @Test
    public void negativeInputsAndNegativeOutput() throws Exception {
        assertEquals(-2, new Fraction(-3).plus(new Fraction(1)).intValue());

    }

    @Test
    public void nonTrivalSameDenominator() throws Exception {
        final Fraction sum = new Fraction(1, 5).plus(new Fraction(2, 5));
        assertEquals(new Fraction(3,5), sum);
    }

}

