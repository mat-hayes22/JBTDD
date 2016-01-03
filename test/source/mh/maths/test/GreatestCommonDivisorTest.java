package mh.maths.test;

import org.junit.Test;

import static mh.maths.Fraction.NumberTheory.gcd;
import static org.junit.Assert.assertEquals;

/**
 * Created by mat on 03/01/2016.
 */
public class GreatestCommonDivisorTest {

    @Test
    public void reflexive() throws Exception {
        assertEquals(1, gcd(1,1));
        assertEquals(2, gcd(2,2));
        assertEquals(2, gcd(-2,-2));
    }

    @Test
    public void relativelyPrime() throws Exception {
        assertEquals(1, gcd(2,3));
        assertEquals(1, gcd(4,7));
        assertEquals(1, gcd(-4,-7));
    }
    @Test
    public void multipleOfOther() throws Exception {
        assertEquals(3, gcd(3,9));
        assertEquals(5, gcd(5,25));
    }

    @Test
    public void commonFactor() throws Exception {
        assertEquals(2, gcd(6,8));
        assertEquals(7, gcd(49,315));
        assertEquals(4, gcd(-24,-28));
    }


}

