package mh.maths.test;

import mh.maths.Fraction.Fraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by mat on 02/01/2016.
 */
public class FractionEqualsTest {

    @Test
    public void sameNumeratorAndDenominator() throws Exception {


        assertEquals(new Fraction(3,5), new Fraction(3,5));
    }

}
